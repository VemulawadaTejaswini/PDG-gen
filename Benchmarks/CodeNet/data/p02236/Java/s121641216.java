import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double[] p = new double[n+1];
        double[] q = new double[n+1];
        for(int i = 1; i <= n; i++) {
            p[i] = input.nextDouble();
        }
        for(int i = 0; i <= n; i++) {
            q[i] = input.nextDouble();
        }
        System.out.println(getMinCost(n, p, q));
    }
    private static double getMinCost(int n, double[] p, double[] q) {
        double[][] e = new double[n+2][n+1];
        double[][] w = new double[n+2][n+1];
        for(int i = 0; i <=n; i++) {
            e[i+1][i] = q[i];
            w[i+1][i] = q[i];
        }
        for(int l = 1; l <= n; l++) {
            for(int i = 1; i <= n-l+1; i++) {
                int j = i + l - 1;
                e[i][j] = Double.MAX_VALUE;
                w[i][j] = w[i][j-1] + p[j] + q[j];
                for (int k = i; k <= j; k++) {
                    e[i][j] = Math.min(e[i][j], e[i][k-1] + e[k+1][j] + w[i][j]);
                }
            }
        }
        return e[1][n];
    }
}

