import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long ans = 0;
        for(long i = 1; i < Math.floor(Math.sqrt(N)) + 1; i++) {
            if (N%i != 0) continue;
            long k = N/i;
            if (k >= i + 2) ans += k - 1;
        }
        System.out.println(ans);
    }
}