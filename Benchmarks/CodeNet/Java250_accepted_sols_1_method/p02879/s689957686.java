import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int res = 0;
        
        if( (A >= 10) || (B  >= 10) ){
            res = -1;
        }else {
            res  = A * B;
        }
        
        System.out.println(res);
        
    }
}
