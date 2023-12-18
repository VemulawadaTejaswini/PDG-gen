import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long b = sc.nextLong();
        long r = sc.nextLong();
        
        long tmp1 = n / (b+r);
        long tmp2 = n % (b+r);
        
        long ans = tmp1*b+Math.min(b, tmp2);
        
        
        System.out.println(ans);
    }
}
