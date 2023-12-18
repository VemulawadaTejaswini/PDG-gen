import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int intNum = sc.nextInt();
        
        int h =intNum / 3600;
        
        int m =(intNum -(h * 3600)) / 60;
        
        int s =((intNum -(h * 3600)) - ( m * 60 ));
        
        System.out.println(h +":"+ m + ":" + s);
    }
}

