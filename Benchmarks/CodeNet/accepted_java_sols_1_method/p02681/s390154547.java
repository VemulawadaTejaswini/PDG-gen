import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final String s = sc.next();
        final String t = sc.next();

        if (t.substring(0, t.length()-1).equals(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
