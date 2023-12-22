import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int N = Integer.parseInt(sc.next());
        final int L = Integer.parseInt(sc.next());
        String[] ss = new String[N];
        for (int i = 0; i < N; i++) {
            ss[i] = sc.next();
        }
        
        Arrays.sort(ss);
        String ans = "";
        for (int i = 0; i < N; i++) {
            ans += ss[i];
        }
        
        out.println(ans);
        
        out.flush();
    }
}