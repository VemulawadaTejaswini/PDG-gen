import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int N = Integer.parseInt(sc.next());
        final int T = Integer.parseInt(sc.next());
        final int A = Integer.parseInt(sc.next());
        int ans = 0;
        double min = 1e6;
        
        for (int i = 0; i < N; i++) {
            int h = Integer.parseInt(sc.next());
            double b = T - h * 0.006;
            double abs = Math.abs(A - b);
            min = Math.min(min, abs);
            if (min == abs) {
                ans = i + 1;
            }
        }
        
        out.println(ans);
        
        out.flush();
    }
}