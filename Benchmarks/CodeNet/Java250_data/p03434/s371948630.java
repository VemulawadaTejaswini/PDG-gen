import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        DecimalFormat df = new DecimalFormat("0.00000000");

        final int N = Integer.parseInt(sc.next());
        Integer[] a = new Integer[N];
        int alice = 0;
        int bob = 0;
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(a, Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                alice += a[i];
            } else {
                bob += a[i];
            }
        }
        out.println(alice - bob);

        out.flush();
    }
}