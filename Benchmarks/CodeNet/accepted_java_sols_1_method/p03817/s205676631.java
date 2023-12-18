import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int mod = 11;
        long ans = (n / mod) * 2;
        if (n % mod == 0) {
            
        } else if (n % mod <= 6) {
            ans++;
        } else {
            ans++;
            ans++;
        }
        System.out.println(ans);
    }
}
