import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int n = in.nextInt();
            int k = in.nextInt();
            if((n|k) == 0) break;
            boolean[] app = new boolean[n + 1];
            boolean joker = false;
            for (int i = 0; i < k; i++) {
                int x = in.nextInt();
                if (x == 0) joker = true;
                else app[x] = true;
            }
            int[] l = new int[n + 2];
            int[] r = new int[n + 2];
            for (int i = 0; i <= n; i++) {
                if (app[i]) l[i] = r[i] = 1;
            }
            for (int i = 1; i <= n; i++) {
                if (app[i]) {
                    l[i] = l[i - 1] + 1;
                } else {
                    l[i] = 0;
                }
            }
            for (int i = n - 1; i >= 0; i--) {
                if (app[i]) {
                    r[i] = r[i + 1] + 1;
                } else {
                    r[i] = 0;
                }
            }
            int res = 0;
            if (joker) {
                for (int i = 2; i <= n - 1; i++) {
                    res = Math.max(l[i - 1] + r[i + 1] + 1, res);
                }
            } else {
                for (int i = 1; i <= n; i++) {
                    res = Math.max(res, r[i]);
                }
            }
            System.out.println(res);
        }
    }
}