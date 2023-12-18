import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        DecimalFormat df = new DecimalFormat("0.00000000");

        final int N = Integer.parseInt(sc.next());
        final int K = Integer.parseInt(sc.next());
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(sc.next());
            sum += Math.min(x * 2, Math.abs(x - K) * 2);
        }
        out.println(sum);

        out.flush();
    }
}