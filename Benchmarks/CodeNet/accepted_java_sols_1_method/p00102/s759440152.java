import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        while(true){
            int n = in.nextInt();
            if(n == 0) return ;
            int mat[][] = new int[n+1][n+1];
            for(int i=0; i<n; i++){
                int sumr = 0;
                for(int j=0; j<n; j++){
                    mat[i][j] = in.nextInt();
                    sumr += mat[i][j];
                }
                mat[i][n] = sumr;
            }
            for(int j=0; j<=n; j++){
                int sumc = 0;
                for(int i=0; i<n; i++){
                    sumc += mat[i][j];
                }
                mat[n][j] = sumc;
            }
            for(int i=0; i<=n; i++){
                for(int j=0; j<=n; j++){
                    System.out.printf("%5d",mat[i][j]);
                }
                System.out.println();
            }
        }
    }
}