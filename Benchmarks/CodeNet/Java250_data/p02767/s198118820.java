import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        sc.useDelimiter(",");
//        DecimalFormat df = new DecimalFormat("0.00000000");
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = Integer.parseInt(sc.next());
        long sum = 0;
        long ans = 1000000000;
        for (int j = 0; j <= 100; j++) {
            for (int i = 0; i < n; i++) {
                sum += (a[i] - j) * (a[i] - j);
            }
            ans = Math.min(sum, ans);
            sum = 0;
        }
        out.println(ans);
        out.flush();
    }
}