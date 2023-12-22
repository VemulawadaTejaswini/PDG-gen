import java.util.stream.IntStream;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int N = Integer.parseInt(sc.next());
        Object[] s = IntStream.range(0, N).mapToObj(i -> sc.next()).toArray();
        final int M = Integer.parseInt(sc.next());
        Object[] t = IntStream.range(0, M).mapToObj(i -> sc.next()).toArray();
        int ans = 0;
        
        for (int i = 0; i < N; i++) {
            int blue = 0;
            int red = 0;
            for (int j = 0; j < N; j++) {
                if (s[i].equals(s[j])) {
                    blue++;
                }
            }
            for (int k = 0; k < M; k++) {
                if (s[i].equals(t[k])) {
                    red++;
                }
            }
            ans = Math.max(ans, blue - red);
        }
        
        out.println(ans);

        out.flush();
    }
}