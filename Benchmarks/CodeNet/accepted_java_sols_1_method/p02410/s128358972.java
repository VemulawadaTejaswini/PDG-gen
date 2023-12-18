import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
                int m = sc.nextInt();
                int matrix_A[][] = new int[n][m];
                int matrix_B[] = new int[m]; 
                int AB = 0;
                for(int i = 0; i < n; i++){
                    for(int j = 0; j < m; j++){
                     int num = sc.nextInt();
                     matrix_A[i][j] = num;
                    }
                }
                for(int j = 0; j < m; j++){
                    int num = sc.nextInt();
                   matrix_B[j] =  num;
                }
                for(int i = 0; i < n; i++){
                    for(int j = 0; j < m; j++){
                AB += matrix_A[i][j]*matrix_B[j];
                    }
                    System.out.println(AB);
                    AB = 0;
                }
    }
}