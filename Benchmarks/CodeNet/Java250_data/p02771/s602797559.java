
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = Integer.parseInt(s.next());
        int b = Integer.parseInt(s.next());
        int c = Integer.parseInt(s.next());
        if (a == b) {
            if (b == c) {
                // No
                System.out.println("No");
            } else {
                // Yes
                System.out.println("Yes");
            }
        } else {
            if (a == c || b == c) {
                // Yes
                System.out.println("Yes");
            } else {
                System.out.println("No");
                // No
            }
        }
    }
}