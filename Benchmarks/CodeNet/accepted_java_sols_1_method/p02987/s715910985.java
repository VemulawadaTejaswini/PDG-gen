import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char c0 = str.charAt(0);
        char c1 = str.charAt(1);
        char c2 = str.charAt(2);
        char c3 = str.charAt(3);

        if ((c0 == c1 && c2 == c3 & c0 != c2)
            || (c0 == c2 && c1 == c3 & c0 != c1)
                || (c0 == c3 && c1 == c2 & c0 != c1)) {

            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}