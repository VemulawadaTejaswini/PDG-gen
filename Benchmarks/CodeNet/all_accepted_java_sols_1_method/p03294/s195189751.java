import java.util.stream.IntStream;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int N = Integer.parseInt(sc.next());
        int[] a = IntStream.range(0,N).map(i -> Integer.parseInt(sc.next())).toArray();
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += (a[i] - 1);
        }
        
        out.println(ans);
        
        out.flush();
    }
}