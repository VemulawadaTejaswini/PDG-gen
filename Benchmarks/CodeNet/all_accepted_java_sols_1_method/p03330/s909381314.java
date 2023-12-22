import java.util.*;
import java.io.*;
import java.math.BigInteger;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int[][] D = new int[C][C];
        for(int i = 0; i < C; i++) {
            for(int j = 0; j < C; j++) {
                D[i][j] = sc.nextInt();
            }
        }
        int[][] c = new int[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                c[i][j] = sc.nextInt();
            }
        }

        int[][] c_sum = new int[3][C];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                c_sum[(i + j) % 3][c[i][j] - 1]++;
            }
        }
        int min = 2 << 28;
        for(int c1 = 0; c1 < C; c1++) {
            for(int c2 = 0; c2 < C; c2++) {
                for(int c3 = 0; c3 < C; c3++) {
                    int cou = 0;
                    if(c1 == c2 || c2 == c3 || c1 == c3) continue;
                    for(int i = 0; i < C; i++) {
                        cou += c_sum[0][i] * D[i][c1];
                    }
                    for(int i = 0; i < C; i++) {
                        cou += c_sum[1][i] * D[i][c2];
                    }
                    for(int i = 0; i < C; i++) {
                        cou += c_sum[2][i] * D[i][c3];
                    }
                    min = Math.min(min,cou);
                }
            }
        }

        System.out.println(min);






    }
}