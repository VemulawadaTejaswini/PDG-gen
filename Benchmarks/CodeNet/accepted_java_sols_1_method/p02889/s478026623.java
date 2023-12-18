import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int L = sc.nextInt();
        double[][] D = new double[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(i!=j)
                    D[i][j] =Double.POSITIVE_INFINITY;
            }
        }
        int[][] A = new int[3][M];
        for(int i = 0; i < M; i++){
            A[0][i] = sc.nextInt();
            A[1][i] = sc.nextInt();
            A[2][i] = sc.nextInt();
            if(A[2][i] <= L){
                D[A[0][i]-1][A[1][i]-1] = A[2][i];
                D[A[1][i]-1][A[0][i]-1] = A[2][i];
            }
        }
         
        int Q = sc.nextInt();
        int[][] s = new int[2][Q];
        for(int i = 0; i < Q; i++){
           s[0][i] = sc.nextInt();
           s[1][i] = sc.nextInt();
        }
        sc.close();

        for(int k = 0; k < N; k++){
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    D[i][j] = Math.min(D[i][j], D[i][k]+D[k][j]);
                }
            }
        }
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(i == j)
                    D[i][j] = 0;
                else if(D[i][j] > L){
                    D[i][j] = Double.POSITIVE_INFINITY;
                } else
                    D[i][j] = 1;
            }
        }
        for(int k = 0; k < N; k++){
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    D[i][j] = Math.min(D[i][j], D[i][k]+D[k][j]);
                }
            }
        }
        
        for(int i = 0; i < Q; i++){
            if(D[s[0][i]-1][s[1][i]-1] == Double.POSITIVE_INFINITY)
                System.out.println(-1);
            else
                System.out.println((int)D[s[0][i]-1][s[1][i]-1]-1);
        }
    }
}