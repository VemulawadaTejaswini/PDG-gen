import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        DecimalFormat df = new DecimalFormat("0.00000000");

        final int N = Integer.parseInt(sc.next());
        final int M = Integer.parseInt(sc.next());
        final int X = Integer.parseInt(sc.next());
        int ans = 0;
        for (int i = 0; i < M; i++) {
            int a = Integer.parseInt(sc.next());
            if (a < X) {
                ans++;
            } else {
                ans = Math.min(ans, M - ans);
                break;
            }
        }
        out.println(ans);
        
        out.flush();
    }
}