import java.util.stream.IntStream;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int N = Integer.parseInt(sc.next());
        int[] a = IntStream.range(0, N).map(i -> Integer.parseInt(sc.next())).toArray();
        int[] b = IntStream.range(0, N).map(i -> Integer.parseInt(sc.next())).toArray();
        int ans = 0;

        for (int j = 0; j < N; j++) {
            int asum = IntStream.rangeClosed(0, j).map(i -> a[i]).sum();
            int bsum = IntStream.range(j, N).map(i -> b[i]).sum();
            ans = Math.max(ans, asum + bsum);
        }

        out.println(ans);

        out.flush();
    }
}