import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), m = scan.nextInt(), l = scan.nextInt();
        int[][] A = new int[n][m];
        int[][] B = new int[m][l];
        int[][] C = new int[n][l];
        int i, j, k;
        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++){
                A[i][j] = scan.nextInt();
            }
        }
        for(j = 0; j < m; j++){
            for(k = 0; k < l; k++){
                B[j][k] = scan.nextInt();
            }
        }

        for(i = 0; i < n; i++){
            for(k = 0; k < l; k++){
                C[i][k] = 0;
                for(j = 0; j < m; j++){ C[i][k] += A[i][j] * B[j][k]; }
            }
        }
        for(i = 0; i < n; i++){
            for(k = 0; k < l - 1; k++){
                System.out.print(C[i][k] + " ");
            }
            System.out.println(C[i][l - 1]);
        }
    }
}

