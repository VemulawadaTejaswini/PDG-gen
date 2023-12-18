import java.io.*;
import java.util.*;
import java.math.*;
 
public class Main {
 
        Scanner sc = new Scanner(System.in);
 
        void run() {
                int n = sc.nextInt();
                int m = sc.nextInt();
                int l = sc.nextInt();
                int[] p = new int[n];
                int[] t = new int[n];
                int[] v = new int[n];
 
                for (int i = 0; i < n; i++) {
                        p[i] = sc.nextInt();
                        t[i] = sc.nextInt();
                        v[i] = sc.nextInt();
                }
                m++;
                double win[][] = new double[n][m];
 
                long time[][] = new long[n][m];
 
                double rate[][] = new double[n][m];
 
                double memo[] = new double[m];
 
                double fact[] = new double[m];
 
                if (m == 0) {
                        int z = 0;
                        boolean ok = true;
                        for (int i = 0; i < n; i++) {
                                if (v[i] > v[z]) {
                                        z = i;
                                        ok = true;
                                } else if (v[i] == v[z]) {
                                        ok = false;
                                }
                        }
 
                        for (int i = 0; i < n; i++) {
                                if (ok && i == z) {
                                        System.out.println(1.);
                                } else {
                                        System.out.println(0.);
                                }
                        }
 
                }
                fact[0] = 1;
                for (int i = 1; i < m; i++) {
                        fact[i] = fact[i - 1] * i;
                }
                double value = 0;
                memo[0] = 1;
                value += memo[0];
                for (int i = 1; i < m; i++) {
                        memo[i] = fact[m - 1] / fact[m - i - 1] / fact[i];
                        value += memo[i];
                }
 
                for (int i = 0; i < m; i++) {
//                      memo[i] /= m;
                }
//               System.out.println(Arrays.toString(memo));
                for (int i = 0; i < n; i++) {
                        double rate1 = 1;
                        double rate2 = 1;
                        for (int j = 0; j < m - 1; j++) {
                                rate2 *= 1 - p[i] / 100.0;
                        }
 
                        double rate3 = 0;
                        for (int j = 0; j < m; j++) {
//                               System.out.println(rate2+" "+rate1);
                                time[i][j] =  l + v[i] * j * t[i];
                                if(j==m-1){
                                        rate2 = 1;
                                }
                                rate[i][j] = memo[j] * rate1  * rate2;
                                rate3 += rate[i][j];
                                rate1 *= p[i] / 100.0;
                                if (p[i] != 100) {
                                        rate2 /= 1 - p[i] / 100.0;
                                }
                        }
//                       System.out.println(i+" "+Arrays.toString(time[i]));
                        
                        for (int j = 0; j < m; j++) {
                                rate[i][j] /= rate3;
                        }
//                       System.out.println(Arrays.toString([i]));
                }
 
                for (int i = 0; i < n; i++) {
                        double ans = 0;
                        for (int j = 0; j < m; j++) {
                                win[i][j] = 1;
 
                                for (int k = 0; k < n; k++) {
                                        if (i == k) {
                                                continue;
                                        }
                                        double buffer = 0;
                                        for (int z = 0; z < m; z++) {
                        //                      System.out.print(i+" "+j + " "+ k + " "+z);
                                                if (time[i][j]*v[k] < v[i]*time[k][z]) {
                                                        buffer += rate[k][z];
                        //                              System.out.print(" "+"ok");
                                                }
                        //                      System.out.println();
                                        }
                                        win[i][j] *= buffer;
                                }
                                ans += win[i][j]* rate[i][j];
                        }
                        System.out.printf("%f\n",ans);
                }
 
        }
 
        public static void main(String[] args) {
                Main m = new Main();
                m.run();
        }
 
}