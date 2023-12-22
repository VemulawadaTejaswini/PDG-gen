import java.io.PrintWriter;
import java.util.Scanner;

class Main{
    private static final Scanner sc = new Scanner(System.in);
    private static final PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] Args){
        final int n = Integer.parseInt(sc.next());
        final int m = Integer.parseInt(sc.next());
        final int l = Integer.parseInt(sc.next());
        final int a[][] = new int[n][m];
        final int b[][] = new int[m][l];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                a[i][j] = Integer.parseInt(sc.next());
            }
        }
        for(int i = 0; i<m; i++){
            for(int j = 0; j<l; j++){
                b[i][j] = Integer.parseInt(sc.next());
            }
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<l; j++){
                long ans = 0;
                for(int k = 0; k<m; k++){
                    ans += a[i][k]*b[k][j];
                }
                if(j!=0) out.print(' ');
                out.print(ans);
            }
            out.println();
        }
        out.flush();
    }
}