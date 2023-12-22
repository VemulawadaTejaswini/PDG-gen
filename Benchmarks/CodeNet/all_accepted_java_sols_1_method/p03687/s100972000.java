import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        char[] s = scanner.next().toCharArray();
        int ans = 100;
        for (char c = 'a'; c <= 'z'; c++) {
            int[] a = new int[s.length + 1];
            a[s.length] = 101;
            for (int i = s.length - 1; i >= 0; i--)
                a[i] = s[i] == c ? 0 : a[i + 1] + 1;
            for (int i = 0, max = 0; i < s.length; i++)
                ans = Math.min(ans, Math.max(max = Math.max(max, a[i]), s.length - i - 1));
        }
        System.out.println(ans);
    }
}