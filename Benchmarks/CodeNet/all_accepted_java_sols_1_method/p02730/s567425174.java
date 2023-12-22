import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = 0;
        int r = (s.length() / 2) - 1;
        for (int i = l; i <= r / 2 - 1; i++) {
            if (s.charAt(i) != s.charAt(r)) {
                System.out.println("No");
                return;
            }
            r--;
        }
        l = s.length() / 2 + 1;
        r = s.length() - 1;
        for (int i = l; i <= l + s.length() / 4; i++) {
            if (s.charAt(i) != s.charAt(r)) {
                System.out.println("No");
                return;
            }
            r--;
        }
        l = 0;
        r = s.length() - 1;
        for (int i = 0; i <= s.length() / 2 - 1; i++) {
            if (s.charAt(i) != s.charAt(r)) {
                System.out.println("No");
                return;
            }
            r--;
        }
        System.out.println("Yes");
    }
}