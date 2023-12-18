import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int N = Integer.parseInt(sc.next());
        int[] t = new int[N];
        for (int i = 0; i < N; i++) {
            t[i] = Integer.parseInt(sc.next());
        }
        final int M = Integer.parseInt(sc.next());
        
        for (int i = 0; i < M; i++) {
            int p = Integer.parseInt(sc.next());
            int x = Integer.parseInt(sc.next());
            int tmp = t[p-1];
            t[p-1] = x;
            long sum = 0;
            for (int j = 0; j < N; j++) {
                sum += t[j];
            }
            out.println(sum);
            t[p-1] = tmp;
        }
        
        out.flush();
    }
}