import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int X = Integer.parseInt(sc.next());
        final int N = (int)Math.sqrt(X) + 1;
        int ans = 1;
        
        for (int i = 1; i <= N; i++) {
            for (int j = 2; j <= N; j++) {
                int x = (int)Math.pow(i, j);
                if (x <= X) ans = Math.max(x, ans);
            }
        }

        out.println(ans);
        
        out.flush();
    }
}