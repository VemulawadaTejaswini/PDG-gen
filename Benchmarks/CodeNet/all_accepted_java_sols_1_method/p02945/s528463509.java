import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);
       int A = scan.nextInt();
       int B = scan.nextInt();
       int add = A + B ;
       int sub = A - B ;
       int mul = A * B ;
       int max;
       if (add <= sub){
            max = Math.max(sub, mul);
        } else {
            max = Math.max(add, mul);
        }
       System.out.println(max);
       
    }
    
}
