import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int N = Integer.parseInt(sc.next());
        int[][] a = new int[2][N];
        for (int j = 0; j < N; j++) {
            a[0][j] = Integer.parseInt(sc.next());
        }
        for (int j = 0; j < N; j++) {
            a[1][j] = Integer.parseInt(sc.next());
        }
        int ans = 0;
        
        for (int i = N - 1; i >= 0; i--) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += a[0][j];
            }
            for (int j = i; j < N; j++) {
                sum += a[1][j];
            }
            ans = Math.max(ans, sum);
        }

        out.println(ans);
        
        out.flush();
    }
}