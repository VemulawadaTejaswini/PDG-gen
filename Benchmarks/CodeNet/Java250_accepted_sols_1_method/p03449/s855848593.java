import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

class Main{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                int[][] A = new int[3][N+2];
                A[1][0] = 0;
                A[2][N+1] = 0;
                for(int j=1; j<=N; j++){
                        A[1][j] = A[1][j-1] + sc.nextInt();
                }

                for(int j=1; j<=N; j++){
                        A[2][j] = sc.nextInt();
                }

                for(int j=N; j>=1; j--){
                        A[2][j] = A[2][j+1] + A[2][j];
                }

                int Max = 0;
                for(int i=1; i<=N; i++){
                        Max = Math.max(A[1][i]+A[2][i],Max);
                }
                System.out.print(Max);
        }
}
