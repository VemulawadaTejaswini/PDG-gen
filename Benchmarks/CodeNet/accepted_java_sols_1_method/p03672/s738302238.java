import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int ans = 0;
        for (int i = 1; i < s.length(); i++) {
            if ((s.length() - i) % 2 != 0) {
                continue;
            }
            String before = s.substring(0, (s.length() - i) / 2);
            String after = s.substring((s.length() - i) / 2, s.length() - i);
            if (before.equals(after)) {
                ans = before.length() + after.length();
                break;
            }
        }
        System.out.println(ans);
    }
}
