import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        
        for(long a = 1; a <= n;a++){
            ans += (n - 1) / a;
        }
        
        System.out.println(ans);
    }
}
