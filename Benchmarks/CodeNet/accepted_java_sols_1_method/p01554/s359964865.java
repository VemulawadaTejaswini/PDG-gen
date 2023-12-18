import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String, String>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0;i < n;i++){
            String resister = scan.next();
            map.put(resister, resister);
        }
        int m = scan.nextInt();
        boolean flag = false;
        for(int i=0;i < m;i++){
            String id = scan.next();
            if(map.containsKey(id)){
                if(flag){
                    System.out.println("Closed by " + id);
                } else{
                    System.out.println("Opened by " + id);
                }
                flag = !flag;
            } else{
                System.out.println("Unknown " + id);
            }
        }
    }
}