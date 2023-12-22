import java.io.PrintWriter;
import java.util.Scanner;

class Main{
    private static final Scanner sc = new Scanner(System.in);
    private static final PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] Args){
        final int n = Integer.parseInt(sc.next());
        final int m = Integer.parseInt(sc.next());
        final int a[][] = new int[n][m];
        final int b[] = new int[m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                a[i][j] = Integer.parseInt(sc.next());
            }
        }
        for(int i = 0; i<m; i++)
            b[i] = Integer.parseInt(sc.next());
        for(int i = 0; i<n; i++){
            int ans = 0;
            for(int j = 0; j<m; j++){
                ans += a[i][j]*b[j];
            }
            out.println(ans);
        }
        out.flush();
    }
}