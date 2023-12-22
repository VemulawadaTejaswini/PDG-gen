import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int l = input.nextInt();
        long[][] A = new long[n][m];
        long[][] B = new long[m][l];
        long[][] C = new long[n][l];
        for(int i = 0; i < n; i ++ )
            for(int j = 0; j < m; j ++ )
                A[i][j] = input.nextInt();
        for(int i = 0; i < m; i ++ )
            for(int j = 0; j < l; j ++ )
                B[i][j] = input.nextInt();
        for(int i = 0; i < n; i ++ )
            for(int j = 0; j < l; j ++ ){
                C[i][j] = 0;
                for(int k = 0; k < m; k ++)
                    C[i][j] += A[i][k] * B[k][j];
            }
        for(int i = 0; i < n; i ++ ){
            System.out.print(C[i][0]);        
            for(int j = 1; j < l; j ++ )
                System.out.print(" " + C[i][j]);
            System.out.println();
        }
    }
}
