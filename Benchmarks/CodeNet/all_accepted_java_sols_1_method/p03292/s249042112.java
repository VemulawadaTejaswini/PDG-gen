import java.util.stream.IntStream;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int[] a = IntStream.range(0,3).map(i -> Integer.parseInt(sc.next())).sorted().toArray();
        int ans = 0;
        
        for (int i = 1; i >= 0; i--) {
            ans += (int)Math.abs(a[i] - a[i+1]);
        }
        
        out.println(ans);
        
        out.flush();
    }
}