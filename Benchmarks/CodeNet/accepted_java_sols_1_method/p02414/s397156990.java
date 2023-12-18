import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int l = Integer.parseInt(sc.next());
        long[][] a = new long[n][m];
        long[][] b = new long[m][l];
        long[][] c = new long[n][l];
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = Integer.parseInt(sc.next());
        
        for (int i = 0; i < m; i++)
            for (int j = 0; j < l; j++)
                b[i][j] = Integer.parseInt(sc.next());
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < l; j++)
                for (int k = 0; k < m; k++)
                    c[i][j] += a[i][k] * b[k][j];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
                pw.print(c[i][j]);
                if (j < l-1) pw.print(" ");
            }
            pw.println();
        }
        
        pw.flush();
    }
}
