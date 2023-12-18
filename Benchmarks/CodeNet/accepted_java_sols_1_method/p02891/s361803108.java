import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();
        int cnt = 0;
        boolean same = true;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(0) != s.charAt(i + 1)) {
                same = false;
            }
            if (s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
                i++;
            }
        }
        if (same) {
            System.out.println(s.length() * k / 2);
            return;
        }
        long ans = k * cnt;
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            int a = 0;
            while (a < s.length() && s.charAt(0) == s.charAt(a)) {
                a++;
            }
            int b = 0;
            while (b < s.length() && s.charAt(s.length() - 1) == s.charAt(s.length() - b - 1)) {
                b++;
            }
            ans -= (k - 1) * (a / 2 + b / 2 - (a + b) / 2);
        }
        System.out.println(ans);
    }
}

