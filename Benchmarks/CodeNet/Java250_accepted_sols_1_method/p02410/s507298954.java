import java.util.Scanner;

public class Main{
    static Scanner scan = new  Scanner(System.in);
    public static void main(String [] args){
         
            int n = scan.nextInt(); int m = scan.nextInt();
            int [][] mtx = new int [n][m];
            int [] mtx2 = new int [m];
            int [] ans = new int [n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    mtx[i][j] = scan.nextInt();
                }
            }
            for (int i = 0; i < m; i++) {
                mtx2[i] = scan.nextInt();
            }
            
            for (int i = 0; i < n; i++) {   
                for (int j = 0; j < m; j++) {
                     ans[i] += mtx[i][j] * mtx2[j] ;
                }
                System.out.println(ans[i]);
             }
    }
}
