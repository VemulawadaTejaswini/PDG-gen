
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s = new String[3];
        for (int i = 0; i < 3; i++) {
            s[i] = sc.next();
        }
        if (s[0].charAt(s[0].length() - 1) == s[1].charAt(0) &&
                s[1].charAt(s[1].length() - 1) == s[2].charAt(0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
