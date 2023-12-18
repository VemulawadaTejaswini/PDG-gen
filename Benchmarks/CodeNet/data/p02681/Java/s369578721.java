import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        sc.close();

        if (isHalfUpperAlphanumeric(S) && isHalfUpperAlphanumeric(T)) {

        } else {
            System.out.println("No");
            return;
        }

        if (T.length() - S.length() == 1 && T.contains(S)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isHalfUpperAlphanumeric(String str) {
        return Pattern.matches("^[a-z]+$", str);
    }
}