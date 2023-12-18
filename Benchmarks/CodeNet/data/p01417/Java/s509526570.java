import java.io.*;
import java.util.*;
import java.math.*;
 
public class Main {
        Scanner sc = new Scanner(System.in);
 
        void run() {
                int N = sc.nextInt();
                int M = sc.nextInt();
                double L[] = new double[N];
                double a[] = new double[N];
                double b[] = new double[N];
 
                for (int i = 0; i < N; i++) {
                        L[i] = sc.nextDouble();
                        a[i] = sc.nextDouble();
                        b[i] = sc.nextDouble();
                }
 
                double map[][] = new double[N][N];
 
                for (int i = 0; i < N; i++) {
                        for (int j = i; j < N; j++) {
                                map[i][j] = (L[i] - L[j]) * (L[i] - L[j]);
                                map[i][j] += (a[i] - a[j]) * (a[i] - a[j]);
                                map[i][j] += (b[i] - b[j]) * (b[i] - b[j]);
                                map[j][i] = map[i][j];
                        }
                }
 
                double dp[] = new double[1 << N];
                double max = 0;
                for (int i = 0; i < 1 << N; i++) {
                        // if(Integer.bitCount(i) >= M){
                        // continue;
                        // }
                        for (int j = 0; j < N; j++) {
                                int shj = 1 << j;
 
                                if ((i & shj) != 0) {
                                        continue;
                                }
                                double sum = 0;
                                for (int z = 0; z < N; z++) {
                                        int shz = 1 << z;
 
                                        if ((i & shz) == 0) {
                                                continue;
                                        }
                                        sum += map[j][z];
                                }
 
                                dp[i | shj] = Math.max(dp[i | shj], dp[i] + sum);
                                if (Integer.bitCount(i | shj) == M) {
                                        max = Math.max(dp[i | shj], max);
                                }
                        }
                }
//              System.out.println(Arrays.toString(dp));
                System.out.println(max);
        }
 
        public static void main(String[] args) {
                Main m = new Main();
                m.run();
        }
 
}
 