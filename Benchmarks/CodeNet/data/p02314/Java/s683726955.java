import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

class Main{
        public static void main(String args[]){
                Scanner scan = new Scanner(System.in);
                int n = scan.nextInt();
                int m = scan.nextInt();
                int[] c = new int[m];
                for(int i=0; i<m; i++){
                        c[i] = scan.nextInt();
                }
                Arrays.sort(c);

                // (1) ??¬??¨???????????????????????????
                int T[][] = new int[m][n+1];

                // (2) T[0][n]=n??§?????????
                for(int i=0; i<n+1; i++){
                        T[0][i] = i;
                }

                // (3) ????????????????????´??°?????????
                // T[i][j] = Math.min(T[i-1][j], T[i][j-c[i]]+1)
                for(int i=1; i<m; i++){
                        for(int j=0; j<n+1; j++){
                                if (j-c[i] < 0)
                                {
                                        T[i][j] = T[i-1][j];
                                }else{
                                        T[i][j] = Math.min(T[i-1][j], T[i][j-c[i]]+1);
                                }
                        }
                }

                System.out.println(T[m-1][n]);
        }
}