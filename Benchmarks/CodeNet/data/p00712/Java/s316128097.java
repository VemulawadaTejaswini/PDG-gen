import java.io.IOException;
import java.util.Scanner;

public class Main {
    static int a, n;

    static int bfs(int p, int q, int startq, int count, int pi) {
        if (p == 0) return 1; /*??´??£???????????????*/
        if (p < 0 || n <= count) return 0; /*??????????????? or n???????????? */

        int res = 0;
        for (int i = startq; pi * i <= a; i++) {
            int np = p * i - q;
            int nq = q * i;
            res += bfs(np, nq, i, count + 1, pi * i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            a = sc.nextInt();
            n = sc.nextInt();
            if (p == 0)
                break;
            System.out.println(bfs(p, q, 1, 0, 1));
        }
    }
}