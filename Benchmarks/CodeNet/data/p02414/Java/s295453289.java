import java.util.Scanner;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    Scanner sc = new Scanner(System.in);

    void solve() {
        int n, m, l;
        long[][] m1, m2, m3;
        n = sc.nextInt();
        m = sc.nextInt();
        l = sc.nextInt();
        m1 = new long[n][];
        for (int i = 0; i < n; ++i) {
            m1[i] = new long[m];
            for (int j = 0; j < m; ++j) {
                m1[i][j] = sc.nextInt();
            }
        }
        m2 = new long[m][];
        for (int i = 0; i < m; ++i) {
            m2[i] = new long[l];
            for (int j = 0; j < l; ++j) {
                m2[i][j] = sc.nextInt();
            }
        }
        m3 = new long[n][];
        for (int i = 0; i < n; ++i) {
            m3[i] = new long[l];
            for (int j = 0; j < l; ++j) {
                long temp = 0;
                for (int k = 0; k < m; ++k) {
                    temp += m1[i][k] * m2[k][j];
                }
                m3[i][j] = temp;
            }
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < l - 1; ++j) {
                System.out.print(m3[i][j] + " ");
            }
            System.out.println(m3[i][l - 1]);
        }

    }

}


