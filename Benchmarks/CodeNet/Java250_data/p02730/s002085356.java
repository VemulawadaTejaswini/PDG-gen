import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean ans = true;
        if (checkPalindrome(s)) {
            boolean half1 = checkPalindrome(s.substring(0, (s.length() - 1) / 2));
            boolean half2 = checkPalindrome(s.substring((s.length() + 3) / 2 - 1, s.length()));
            ans = half1 && half2;
        } else {
            ans = false;
        }
        System.out.println(ans ? "Yes" : "No");
    }

    public static boolean checkPalindrome(String str) {
        boolean res = true;
        char[] chars = str.toCharArray();
        int strLength = str.length() - 1;
        for (int i = 0; i <= strLength / 2; i++) {
            if (chars[i] != chars[strLength - i]) {
                res = false;
                break;
            }
        }
        return res;
    }
}