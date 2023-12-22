import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int i = 0;
        int j = 0;
        int sum = 0;
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int A[][] = new int[n][m];
        int b[] = new int[m];
        
        for(i=0; i<n; i++){
            for(j=0; j<m; j++){
                A[i][j] = sc.nextInt();
            }
        }
        
        for(j=0; j<m; j++){
            b[j] = sc.nextInt();
        }
        
        for(i=0; i<n; i++){
            sum = 0;
            for(j=0; j<m; j++){
                sum = sum +(A[i][j]*b[j]);
            }
            System.out.println(sum);
        }
        
    }
}

