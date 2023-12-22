import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int N = Integer.parseInt(sc.next());
        int ans = 0;
        
        for (int i = 1; i <= N; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) cnt++;
            }
            if (i % 2 != 0 && cnt == 8) ans++;
        }

        out.println(ans);
        
        out.flush();
    }
}