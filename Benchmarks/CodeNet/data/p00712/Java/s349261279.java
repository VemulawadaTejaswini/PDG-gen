import java.util.Scanner;

public class Main {
    int             p, q, a, n, c;
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }

    public void run() {
        while (true) {
            p = scanner.nextInt();
            q = scanner.nextInt();
            a = scanner.nextInt();
            n = scanner.nextInt();
            if (p == 0 && q == 0 && a == 0 && n == 0) {
                break;
            }
            c = 0;
            dfs(0, 1, 1, 0);
            System.out.println(c);
        }
    }

    public void dfs(int num, int den, int x, int k) {
        if (p * den == q * num) {
            c++;
            return;
        }
        if (k == n)
            return;
        if (p * den < q * num)
            return;
        for (int i = x; i * den <= a; i++) {
            int nn = num * i + den;
            int nd = i * den;
            dfs(nn, nd, i, k + 1);
        }
    }
}