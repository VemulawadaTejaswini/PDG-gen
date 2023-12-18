import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        String s = scanner.next();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != "CODEFESTIVAL2016".charAt(i)) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}