
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int win = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == 'o') {
                ++win;
            }
        }
        win += (15 - s.length());
        if (win >= 8) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
