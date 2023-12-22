import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = s.length();

        if (!isPalindrome(s)) {
            System.out.println("No");
            return;
        }
        if (!isPalindrome(s.substring(0, (n - 1) / 2))) {
            System.out.println("No");
            return;
        }
        if (!isPalindrome(s.substring((n + 3) / 2 - 1, n))) {
            System.out.println("No");
            return;
        }

        System.out.println("Yes");
    }

    public static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++; r--;
        }
        return true;
    }
}