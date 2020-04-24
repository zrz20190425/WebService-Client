package test;
public class demo {

    public static void main(String[] args) {
        try{
            DemoService_ServiceLocator webServiceImpl = new DemoService_ServiceLocator();
            String result = webServiceImpl.getDemoServiceImplPort().sayHello("WebService测试！");
            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
