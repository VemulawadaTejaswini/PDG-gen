import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        final int N = Integer.parseInt(sc.next());
        final int K = Integer.parseInt(sc.next());
        final int Q = Integer.parseInt(sc.next());
        int[] ar = new int[N];
        for (int i = 0; i < Q; i++) {
            int index = Integer.parseInt(sc.next()) - 1;
            ar[index]++; 
        }
        
        for (int i = 0; i < N; i++) {
            if (K - (Q - ar[i]) > 0) {
                out.println("Yes");
            } else {
                out.println("No");
            }
        }

        out.flush();
    }
}