import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] r = new int[n+1];
        int[] c = new int[n+1];
        for(int i = 1; i <= n; i++){
            r[i] = Integer.parseInt(sc.next());
            c[i] = Integer.parseInt(sc.next());
        }
        
        int[][] m = new int[n+1][n+1];
        int[] p = new int[n+1];
        p[0] = r[1];
        for(int i = 1; i <= n; i++){
            p[i] = c[i];
        }
        
        for(int l = 2; l <= n; l++){
            for(int i = 1; i <= n-l+1; i++){
                int j = i+l-1;
                m[i][j] = 1 << 21;
                for(int k = i; k < j; k++){
                    m[i][j] = Math.min(m[i][j], m[i][k] + m[k+1][j] + p[i-1] * p[k] * p[j]);
                }
            }
        }
        
        System.out.println(m[1][n]);
    }
}
