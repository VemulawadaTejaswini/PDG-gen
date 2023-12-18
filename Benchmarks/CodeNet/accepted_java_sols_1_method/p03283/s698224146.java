import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int[] l = new int[M];
        int[] r = new int[M];
        int[][] lr = new int[N + 1][N + 1];
        for (int i = 0; i < M; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
            lr[l[i]][r[i]]++;
        }
        int[] p = new int[Q];
        int[] q = new int[Q];
        for (int i = 0; i < Q; i++) {
            p[i] = sc.nextInt();
            q[i] = sc.nextInt();
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                lr[i][j] += lr[i][j - 1];
            }
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                lr[i][j] += lr[i - 1][j];
            }
        }
        for (int i = 0; i < Q; i++) {
            System.out.println(lr[q[i]][q[i]] + lr[p[i] - 1][p[i] - 1] - lr[p[i] - 1][q[i]] - lr[q[i]][p[i] - 1]);
        }
    }

}
