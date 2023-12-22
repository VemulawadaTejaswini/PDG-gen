import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        char[] s = scanner.next().toCharArray();
        long ans = s.length * (s.length - 1L) / 2 + 1;
        long[] count = new long[26];
        for (char c : s) {
            count[c - 'a']++;
        }
        for (long a : count) {
            ans -= a * (a - 1) / 2;
        }
        System.out.println(ans);
    }
}