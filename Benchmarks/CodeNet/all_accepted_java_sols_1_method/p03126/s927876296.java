import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int N = Integer.parseInt(sc.next());
        final int M = Integer.parseInt(sc.next());
        int[] ar = new int[M];
        int ans = 0;
        
        for (int i = 0; i < N; i++) {
            int k = Integer.parseInt(sc.next());
            for (int j = 0; j < k; j++) {
                int index = Integer.parseInt(sc.next());
                ar[index - 1]++;
            }
        }
        for (int i = 0; i < M; i++) {
            if (ar[i] == N) ans++;
        }
        
        out.println(ans);
        
        out.flush();
    }
}