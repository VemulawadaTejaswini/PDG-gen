import java.util.Scanner;

public class Main {
   public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      String[] input = sc.nextLine().split(" ");
      
      int n = Integer.parseInt(input[0]);
      int m = Integer.parseInt(input[1]);
      int l = Integer.parseInt(input[2]);
      
      //declare matrices
      long[][] matrix_1 = new long[n][m];
      long[][] matrix_2 = new long[m][l];
      long[][] answer = new long[n][l];
            
      //initialize matrix_1
      for(int i = 0; i < n; i ++) {
         input = sc.nextLine().split(" ");
         for(int j = 0; j < m; j ++) {
            matrix_1[i][j] = Integer.parseInt(input[j]);
         }
      }
      
      //initialize matrix_2
      for(int i = 0; i < m; i ++) {
         input = sc.nextLine().split(" ");
         for(int j = 0; j < l; j ++) {
            matrix_2[i][j] = Integer.parseInt(input[j]);
         }
      }
      //calculation
      for(int i = 0; i < n; i ++) {
         for(int j = 0; j < l; j ++) {
            long temp = 0;
            for(int k = 0; k < m; k ++) {
               temp += matrix_1[i][k] * matrix_2[k][j];
            }
            answer[i][j] = temp;
         }
      }
      
      //print out
      for(int i = 0; i < n; i ++) {
         String output = "";
         for(int j = 0; j < l; j ++) {
            output += answer[i][j] + " ";
         }
         System.out.println(output.trim());
      }
      
   }
}
