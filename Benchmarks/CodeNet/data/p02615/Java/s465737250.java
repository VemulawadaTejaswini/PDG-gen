import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Collections;

/**
 * Built using CHelper plug-in Actual solution is at the top
 */
public class Main {
    
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DChatInACircle solver = new DChatInACircle();
        solver.solve(1, in, out);
        out.close();
    }
    
    static class DChatInACircle {
        
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(in.next());
            }
            
            Arrays.sort(a, Collections.reverseOrder());
            long ans = a[0];
            
            Deque<Integer> dq = new ArrayDeque<>();
            dq.offerLast(a[1]);
            dq.offerLast(a[1]);
//        debug(a);
            for (int i = 2; i < n; i++) {
//            debug(dq);
                ans += dq.pollFirst();
                for (int j = 0; j < 2; j++) {
                    dq.offerLast(a[i]);
                }
            }
            // 出力
            out.println(ans);
        }
        
    }
}

