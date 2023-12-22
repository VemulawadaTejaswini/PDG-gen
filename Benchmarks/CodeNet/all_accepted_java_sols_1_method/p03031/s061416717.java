import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        long m = in.nextInt();
        long k[] = new long[11];
        long p[] = new long[11];
        int s[][] = new int[11][11];
        for (int i = 0; i < m; i++) {
            k[i] = in.nextInt();
            for (int j = 0; j < k[i]; j++) {
                s[i][j] = in.nextInt() - 1;
            }
        }
        for (int i = 0; i < m; i++) {
            p[i] = in.nextInt();
        }

        long res = 0;
        for (int b = 0; b < (1 << n); b++) {
            boolean ok = true;
            for (int i = 0; i < m; i++) {
                int cnt = 0;
                for (int j = 0; j < k[i]; j++) {
                    if (((b >> s[i][j]) & 1) == 0) {
                        continue;
                    }
                    cnt++;
                }
                if (cnt % 2 != p[i]) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                res++;
            }
        }
        System.out.println(res);
    }
}