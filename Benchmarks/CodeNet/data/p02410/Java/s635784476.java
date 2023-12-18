import java.util.Scanner;
  
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
  
        int n = scan.nextInt();
        int m = scan.nextInt();
        int [][]A;
        A = new int[n][m];
        int []b;
        b = new int[m];
        int []c;
        c = new int[n];
        int i,j;
  
        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++){
            A[i][j] = scan.nextInt();
            }
        }
  
        for(j = 0; j < m ; j++){
        b[j] = scan.nextInt();
        }
  
        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++){
            c[i] += A[i][j]*b[j];
            }
        }
        System.out.println(c[i]);
          
    }
}