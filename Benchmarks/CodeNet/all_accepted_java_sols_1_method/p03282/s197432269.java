import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        char[] ch = sc.next().toCharArray();
        final int N = ch.length;
        final long K = Long.parseLong(sc.next());
        char ans = '1';
        
        for (int i = 0; i < N; i++) {
            if (ch[i] != '1' && i < K) {
                ans = ch[i];
                break;
            }
        }

        out.println(ans);
        
        out.flush();
    }
}