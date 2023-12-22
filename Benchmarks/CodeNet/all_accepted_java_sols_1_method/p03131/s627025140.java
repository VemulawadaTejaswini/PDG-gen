import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long K = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        sc.close();

        long ans = 0;
        if (B - A > 2) {
            K -= (A - 1);
            ans = A;
            ans += (B - A) * (K / 2);
            if (K % 2 != 0) ans++;
        } else {
            ans = K + 1;
        }
        System.out.println(ans);
    }
}
