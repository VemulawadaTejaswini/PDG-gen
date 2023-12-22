import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int N = Integer.parseInt(sc.next());
        long[] h = new long[N];
        for (int i = 0; i < N; i++) {
            h[i] = Long.parseLong(sc.next());
        }
        int max = 0;
        int cnt = 0;
        
        for (int i = 0; i < N - 1; i++) {
            if (h[i] >= h[i+1]) {
                cnt++;
                max = Math.max(max, cnt);
            } else {
                cnt = 0;
            }
        }
        
        out.println(max);
        
        out.flush();
    }
}