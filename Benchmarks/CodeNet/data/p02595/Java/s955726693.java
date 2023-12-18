import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long d = sc.nextLong();
        d *= d;
        
        int count = 0;
        while(n-- > 0) {
            long x = sc.nextInt();
            long y = sc.nextInt();
            
            long tmp = x * x + y * y;
            
            if (tmp <= d) count++;
        }
        System.out.println(count);
    }
}
