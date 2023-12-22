import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N;
        long D;
        {String[] a = in.readLine().split(" "); N = Integer.parseInt(a[0]); D = Long.parseLong(a[1]);}
        D *= D;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            long x, y; {String[] a = in.readLine().split(" "); x = Long.parseLong(a[0]); y = Long.parseLong(a[1]);}
            long d = x * x + y * y;
            if (d <= D) {
                ans++;
            }
        }
        out.println(ans);
    }
}
