import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        
        String result = (s1.substring(0,1) + s2.substring(0,1) + s3.substring(0,1)).toUpperCase();
        
        System.out.println(result);
      
    }
}
