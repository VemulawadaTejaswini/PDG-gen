import java.util.Scanner;
class Main{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       int n = sc.nextInt();
       int m = sc.nextInt();
       int[][] a = new int[n][m];
       int[] b = new int[m];
       for(int i=0; i<n; i++){
           for(int j=0; j<m; j++){
               int oa = sc.nextInt();
               a[i][j] = oa; 
           }
       }
       for(int j=0; j<m; j++){
           int ob = sc.nextInt();
           b[j] = ob;
       }
       int sum = 0;
       for(int i=0; i<n; i++){
           for(int j=0; j<m; j++){
            sum += a[i][j]*b[j];
           }
           System.out.println(sum);
           sum = 0;
       }
    }
}
