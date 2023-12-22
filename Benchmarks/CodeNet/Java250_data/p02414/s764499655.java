import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n,m,l; 
        
        n = scan.nextInt(); m=scan.nextInt(); l = scan.nextInt();
        
        long [][] mtxA = new long[n][m]; 
        long [][] mtxB = new long[m][l];
        long [][] mtxC = new long[n][l];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                mtxA[i][j] = scan.nextLong();
            }
        }
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < l; j++){
                mtxB[i][j] = scan.nextLong();
            }
        }
      
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
                long sum = 0;
                for (int k = 0; k < m; k++) {
                    sum +=  mtxA[i][k] * mtxB[k][j];
                }
                 mtxC[i][j] =sum; 
            }
            
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(mtxC[i][j]);
                if (j<l-1) {
                    System.out.print(" ");
                }
            }
              System.out.println();
        }
        
    }
}
