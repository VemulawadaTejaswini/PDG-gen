import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        final int N = Integer.parseInt(sc.next());
        long[] h = new long[N];
        for (int i = 0; i < N; i++) {
            h[i] = Long.parseLong(sc.next());
        }
        String ans = "Yes";
        long pre = -1;
        
        for (int i = 0; i < N; i++) {
            if (pre <= h[i]-1) {
                pre = h[i]-1;
            } else if (pre <= h[i]) {
                pre = h[i];
            } else {
                ans = "No";
                break;
            }
        }
        
        out.println(ans);
        
        out.flush();
    }
}