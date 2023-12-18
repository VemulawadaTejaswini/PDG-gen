import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        char[] s = scanner.next().toCharArray();
        int k = scanner.nextInt(), l = s.length - 1;
        StringBuilder ans = new StringBuilder(String.valueOf(s));
        for (int i = 0; i < l; i++) {
            if (s[i] != 'a' && k >= '{' - s[i]) {
                k -= '{' - s[i];
                ans.setCharAt(i, 'a');
            }
        }
        ans.setCharAt(l, (char)((s[l] - 'a' + k % 26) % 26 + 'a'));
        System.out.println(ans);
    }
}