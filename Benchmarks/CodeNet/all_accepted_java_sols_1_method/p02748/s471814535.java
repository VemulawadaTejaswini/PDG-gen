import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        final int A = Integer.parseInt(sc.next());
        final int B = Integer.parseInt(sc.next());
        final int M = Integer.parseInt(sc.next());
        int[] a = new int[A];
        int[] b = new int[B];
        int[] z = new int[M];
        for (int i = 0; i < A; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        for (int i = 0; i < B; i++) {
            b[i] = Integer.parseInt(sc.next());
        }
        for (int i = 0; i < M; i++) {
            int x = Integer.parseInt(sc.next());
            int y = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());
            z[i] = a[x-1] + b[y-1] - c;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(z);
        out.println(Math.min(a[0] + b[0], z[0]));
        
        out.flush();
    }
}