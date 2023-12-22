import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        if (N <= 8) {
            System.out.println(N);
        } else {
            int nl = String.valueOf(N).length();
            int[] na = new int[nl];
            for (int i = 0; i < nl; i++) {
                na[nl - i - 1] = (int)(N % 10);
                N /= 10;
            }

            boolean f = false;
            for (int i = 1; i < nl; i++) {
                if (na[i] != 9) {
                    f = true;
                }
            }

            if (f) {
                for (int i = 1; i < na.length; i++) {
                    na[i] = 9;
                }
                na[0] = na[0] - 1;
            }
            /*
            for (int i = 0; i < nl; i++) {
                System.out.println(na[i]);
            }
            */

            int ans = 0;
            for (int i = 0; i < nl; i++) {
                ans += na[i];
            }
            System.out.println(ans);
        }
    }
}