import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.*;
 
public class Main {
    public static final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static final PrintStream out = System.out;
 
    public static void main(String[] args) {
        String S = in.next();
        int N = S.length();
 
        int l = 0, c = 0;
        int[] result = new int[N];
        for (int i = 1; i < N; i++) {
            if (S.charAt(i) == 'R' && S.charAt(i - 1) == 'L') {
                int L = c - l, R = i - c;
                System.err.println("l: " + l + ", c: " + c + "L: " + L + ", R: " + R);
 
                result[c - 1] += L / 2 + L % 2;
                result[c - 1] += R / 2;
                result[c] += L / 2;
                result[c] += R / 2 + R % 2;
 
                l = i;
            } else if (S.charAt(i) == 'L' && S.charAt(i - 1) == 'R') {
                c = i;
            }
        }
 
        int L = c - l, R = N - c;
        System.err.println("l: " + l + "c: " + c + "L: " + L + ", R: " + R);
 
        result[c - 1] += L / 2 + L % 2;
        result[c - 1] += R / 2;
        result[c] += L / 2;
        result[c] += R / 2 + R % 2;
 
        for (int i : result) {
            out.print(i);
            out.print(" ");
        }
    }
}