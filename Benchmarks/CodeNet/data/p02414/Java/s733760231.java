import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
         
        long[][] a = new long[n][m];
        long[][] b = new long[m][l];
        long[][] c = new long[n][l];
        long sum = 0;
         
        for(int i = 0; i < n; i++){
            for( int j = 0; j < m; j++ ){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < m; i++){
            for( int j = 0; j < l; j++ ){
                b[i][j] = sc.nextInt();
            }
        }
         
         
        for(int i = 0; i < n; i++){
             for(int j = 0; j < l; j++){
                 for(int k=0;k<m;k++){
                    
                    sum+=a[i][k]*b[k][j];
                   }
                
               c[i][j] = sum;
                sum = 0;
                
                if (j == l - 1) {
                    System.out.print(c[i][j]);
                    
                } else { 
                    System.out.print(c[i][j] + " ");
                }
            }
            
            System.out.println();
        }
         
        sc.close();
    }
} 
