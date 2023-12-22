import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        if( N % 2 == 0 ){
            System.out.println(0.5);
        } else {
            int odd  = (N - 1) / 2 + 1;
            System.out.println((double)odd/N);
        }
    }
}
