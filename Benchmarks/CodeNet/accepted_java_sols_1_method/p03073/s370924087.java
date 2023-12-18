
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int num1 = 0;
        char last = s.charAt(0);
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) == last) {
                ++num1;
                last = (s.charAt(i) == '0') ? '1' : '0';
            } else {
                last = s.charAt(i);
            }
        }

        int num2 = 1;
        last = (s.charAt(0) == '0') ? '1' : '0';
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) == last) {
                ++num2;
                last = (s.charAt(i) == '0') ? '1' : '0';
            } else {
                last = s.charAt(i);
            }
        }
        System.out.println(Math.min(num1, num2));
    }
}
