import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final String S = sc.next();

        int ans = 0;

        for (int i = 1; i < S.length(); i ++) {
            final String s = S.substring(0, S.length()-i);
            final String s1 = s.substring(0, s.length() / 2);
            final String s2 = s.substring(s.length() / 2);
            if (s1.equals(s2)) {
                ans = S.length() - i;
                break;
            }
        }

        System.out.println(ans);
    }
}
