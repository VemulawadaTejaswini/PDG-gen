import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        DecimalFormat df = new DecimalFormat("0.00000000");
        
        final int N = Integer.parseInt(sc.next());
        final int K = Integer.parseInt(sc.next());
        long[] a = new long[N];
        long sum = 0;
        for (int i=0; i<N; i++)
            a[i] = Long.parseLong(sc.next());
        Arrays.sort(a);
        for (int i=0; i<N-K; i++)
            sum += a[i];
        out.println(sum);
        
        out.flush();
    }
}