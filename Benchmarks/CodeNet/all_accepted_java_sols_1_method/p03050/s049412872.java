import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0L;
        for (long i = 1; i < Math.sqrt(n)+1; i++) {
            if((n - i) / i <= i) break;
            if((n - i) % i == 0) ans += (n - i) / i;
        }
        System.out.println(ans);
        sc.close();
    }

}
