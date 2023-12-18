import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        final int N = Integer.parseInt(sc.next());
        int[] a = IntStream.range(0, N+1).map(i -> Integer.parseInt(sc.next())).toArray();
        int[] b = IntStream.range(0, N).map(i -> Integer.parseInt(sc.next())).toArray();
        long ans = 0;

        for (int i = 0; i < N; i++) {
            if (a[i] >= b[i]) {
                ans += b[i];
            } else if (a[i] < b[i] && a[i+1] >= b[i] - a[i]) {
                ans += b[i];
                a[i+1] -= (b[i] - a[i]);
            } else if (a[i] < b[i] && a[i+1] < b[i] - a[i]) {
                ans += (a[i] + a[i+1]);
                a[i+1] = 0;
            }
        }
        
        out.println(ans);
        
        out.flush();
    }
}