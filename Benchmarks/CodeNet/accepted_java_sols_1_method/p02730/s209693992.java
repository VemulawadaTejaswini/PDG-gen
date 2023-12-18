import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String S = stdIn.next();
        stdIn.close();

        int n = S.length();

        for (int i = 0; i < (n - 1) / 2; i++) {
            if (S.charAt(i) != S.charAt(n - i - 1)) {
                System.out.println("No");
                return;
            }
        }

        for (int i = 0; i < (n - 1) / 4; i++) {
            if (S.charAt(i) != S.charAt((n - 1) / 2 - 1 - i)) {
                System.out.println("No");
                return;
            }
        }

        for (int i = 0 ; i < (n - 1) / 4; i++) {
            if (S.charAt((n + 1) / 2 + i) != S.charAt(n - 1 - i)) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");

    }
}