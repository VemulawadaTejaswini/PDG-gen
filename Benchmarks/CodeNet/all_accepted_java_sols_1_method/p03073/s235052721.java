import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        boolean is0 = true;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (is0 && c == '0') count++;
            if (!is0 && c != '0') count++;
            is0 = !is0;
        }
        System.out.println(Math.min(count, n - count));
    }
}