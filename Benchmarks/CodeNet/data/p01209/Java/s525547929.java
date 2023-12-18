import java.util.*;

public class Main {

    public static void main(String[] args) throws java.io.IOException {
        Scanner scan = new Scanner(System.in);
        while (true) {
            long m;
            int n = scan.nextInt();
            if (n == 0)
                break;
            m = Long.parseLong(scan.next(), n);

            int f = 0;
            int t = 0;
            for (long i = m; i >= 2; i--) {
                long k = i;
                while (k % 2 == 0) {
                    t++;
                    k /= 2;
                }
                while (k % 5 == 0) {
                    f++;
                    k /= 5;
                }
            }
            int ans = Math.min(t, f);
            System.out.println(ans);
        }
    }
}