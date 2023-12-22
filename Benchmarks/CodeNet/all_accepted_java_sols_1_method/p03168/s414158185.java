import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        double[] p = new double[N + 1];
        double[][] f = new double[N + 1][N + 1];
        for(int i = 1; i <= N;  i++)p[i] = sc.nextDouble();

        f[0][0] = 1;
        for(int i = 1; i <= N; i ++){
            f[i][0] = f[i - 1][0] * (1 - p[i]);
            for(int j = 1; j <= i; j ++){
                f[i][j] = f[i - 1][j - 1] * p[i] + f[i - 1][j] * (1 - p[i]);
            }
        }
        int cnt;
        if((N&1) == 1) cnt = N + 1 >> 1;
        else cnt = (N >> 1) + 1;
        double res = 0.0;
        for(int i = cnt; i <= N; i++)res += f[N][i];
        System.out.println(res);
    }
}