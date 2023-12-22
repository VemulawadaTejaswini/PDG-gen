import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if (n < 10) {
            System.out.println(n);
            return;
        }
        
        long ans = 0;
        long ans2 = 0;
        while (n > 0) {
            if (n < 10) {
                ans += n -1;
                ans2 += n;
                break;
            }
            ans += 9;
            ans2 += n % 10;
            n /= 10;
        }
        System.out.println(Math.max(ans, ans2));
    }
}