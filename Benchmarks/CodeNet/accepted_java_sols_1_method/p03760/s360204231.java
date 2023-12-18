import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String odd = sc.next();
        String even = sc.next();
        final int N = odd.length();
        final int M = even.length();
        final int L = Math.min(N, M);
        
        String ans = "";
        for (int i = 0; i < L; i++) {
            ans += odd.charAt(i);
            ans += even.charAt(i);
        }
        if (N < M) {
            ans += even.charAt(M - 1);
        } else if (N > M) {
            ans += odd.charAt(N - 1);
        }
            
        out.println(ans);
        
        out.flush();
    }
}