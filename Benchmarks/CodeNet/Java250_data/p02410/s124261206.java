import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int A[][] = new int[n][m];
        int b[] = new int[m];
         int seki;
            for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                A[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < m; i++){
            b[i] = scanner.nextInt();
        }
       
        for(int i =0;i<n;i++){
            seki=0;
           for(int j =0;j<m;j++){ 
                seki= seki+A[i][j]*b[j];
           }    
                System.out.println(seki);
           
}
}
}