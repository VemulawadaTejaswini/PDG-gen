import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

class Main{
        public static void main(String args[]){
                Scanner scan = new Scanner(System.in);
                int N = scan.nextInt();
                int W = scan.nextInt();
                int[] v = new int[N+1];
                int[] w = new int[N+1];
                for(int i=0; i<N; i++){
                        v[i] = scan.nextInt();
                        w[i] = scan.nextInt();
                }

                int[][] T = new int[N+1][W+1];
                // (1) ?????????
                for(int i=0; i<=W; i++){
                        T[0][i] = 0;
                }
                for(int i=0; i<=N; i++){
                        T[i][0] = 0;
                }

                // (2) ????????????????????´??°?????????
                // T[i][j] = Math.min(T[i-1][j], T[i][j-c[i]]+1)
                for(int i=1; i<=N; i++){
                        for(int j=1; j<=W; j++){
                                if (j-w[i-1] < 0)
                                {
                                        T[i][j] = T[i-1][j];
                                }else{
                                        T[i][j] = Math.max(Math.max(T[i-1][j], T[i-1][j-w[i-1]]+v[i-1]), T[i][j-w[i-1]]+v[i-1]);
                                }
                        }
                }

                System.out.println(T[N][W]);
        }
}