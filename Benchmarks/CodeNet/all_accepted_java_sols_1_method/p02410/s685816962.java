import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[][] a = new int[n][m];
        int[] b = new int[m];
        int[] result = new int[n];
        
        // input
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                int num = scanner.nextInt();
                a[i][j] = num;
            }
        }
        for(int j=0; j<m; j++) {
            int num = scanner.nextInt();
            b[j] = num;
        }
        
        // calc
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                result[i] += a[i][j] * b[j];
            }
        }
        
        // display
        for(int i=0; i<result.length; i++) {
            System.out.println(result[i]);
        }
        
    }
}
