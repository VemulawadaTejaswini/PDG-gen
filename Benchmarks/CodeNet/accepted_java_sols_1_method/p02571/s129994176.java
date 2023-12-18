import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= s.length() - t.length(); i++) {
            char[] v = s.substring(i, i + t.length()).toCharArray();
            int a = 0;
            for (int j = 0; j < v.length; j++) {
                if (t.charAt(j) != v[j]) {
                    a++;
                }
            }
            ans = Math.min(a, ans);
        }
        System.out.println(ans);
    }
}