import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int N = Integer.parseInt(sc.next());
        int ans = 0;
        int pre = N + 1;
        int[] ar = new int[N];
        for (int i = 0; i < N; i++) {
            ar[i] = N - i;
        }
        
        for (int i = 0; i < N; i++) {
            int p = Integer.parseInt(sc.next());
            if (p == 1) {
                ++ans;
                break;
            } else if (p <= ar[i] && p < pre) {
                ++ans;
                pre = p;
            }
        }
        
        out.println(ans);
        
        out.flush();
    }
}