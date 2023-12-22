import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String s = sc.next();
        final int N = s.length();
        int a = N;
        int z = 0;
        
        for (int i = 0; i < N; i++) {
            if (s.charAt(i) == 'A') {
                a = Math.min(a, i);
            } else if (s.charAt(i) == 'Z') {
                z = Math.max(z, i);
            }
        }
        
        out.println(N > 2 ? z - a + 1 : N);
        
        out.flush();
    }
}