import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int l=sc.nextInt();
        int matrix_A[][]=new int[n][m];
        int matrix_B[][]=new int[m][l];
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                matrix_A[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<m;i++) {
            for (int j = 0; j < l; j++) {
                matrix_B[i][j]=sc.nextInt();
            }
        }


        for(int i=0;i<n;i++) {
            for (int j = 0; j < l; j++) {
                long C=0;
                for (int k = 0; k < m; k++) {
                    C += matrix_A[i][k] * matrix_B[k][j];
                }
                if(j<l-1)System.out.print(C+" ");
                else System.out.println(C);
            }
        }
    }
}
