import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        DecimalFormat df = new DecimalFormat("0.00000000");
        
        final int N = Integer.parseInt(sc.next());
        long[] a = new long[N];
        boolean distinct = true;
        for (int i=0; i<N; i++)
            a[i] = Long.parseLong(sc.next());
        Arrays.sort(a);
        for (int i=0; i<N-1; i++)
            if (a[i] == a[i+1]) distinct = false;
        out.println(distinct ? "YES" : "NO");
        
        out.flush();
    }
}