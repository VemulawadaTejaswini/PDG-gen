import java.util.Arrays;
import java.util.Scanner;
 
 
public class Main {
     
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         
        final int n = sc.nextInt();
        final int x = sc.nextInt();
        final int y = sc.nextInt();
         
        final int X_MAX = x;
        final int Y_MAX = 30000 + y;
         
        int[][] DP = new int[X_MAX + 1][2 * Y_MAX + 1];
        int[][] nextDP = new int[X_MAX + 1][2 * Y_MAX + 1];
        for(int i = 0; i <= X_MAX; i++){
            Arrays.fill(DP[i], -1);
        }
        DP[x][y + Y_MAX] = 0;
         
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= X_MAX; j++){
                for(int k = 0; k <= 2 * Y_MAX; k++){
                    nextDP[j][k] = DP[j][k];
                }
            }
             
            final int a = sc.nextInt();
            final int b = sc.nextInt();
            final int c = sc.nextInt();
            final int d = sc.nextInt();
             
            for(int j = a; j <= X_MAX; j++){
                for(int k = 0; k <= 2 * Y_MAX - b; k++){
                    nextDP[j - a][k + b] = Math.max(DP[j - a][k + b], DP[j][k]);
                }
            }
             
            for(int j = 0; j <= X_MAX; j++){
                for(int k = c; k <= 2 * Y_MAX - c; k++){
                    if(DP[j][k] < 0){ continue; }
                     
                    nextDP[j][k - c] = Math.max(DP[j][k - c], DP[j][k] + d);
                }
            }
             
            {
                int[][] tmp = DP;
                DP = nextDP;
                nextDP = tmp;
            }
        }
         
        int max = 0;
        for(int i = 0; i <= X_MAX; i++){
            for(int j = Y_MAX; j <= 2 * Y_MAX; j++){
                //System.out.println(i + " " + j + " " + DP[i][j]);
                max = Math.max(max, DP[i][j]);
            }
        }
         
        System.out.println(max);
         
        sc.close();
    }   
}