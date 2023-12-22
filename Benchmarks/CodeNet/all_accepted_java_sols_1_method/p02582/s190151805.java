
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();

        if (s.charAt(0) == 'R' && s.charAt(1) == 'R' && s.charAt(2) == 'R') {
            System.out.println(3);
            return;
        }

        if (s.charAt(0) == 'S' && s.charAt(1) == 'R' && s.charAt(2) == 'R') {
            System.out.println(2);
            return;
        }
        if (s.charAt(0) == 'R' && s.charAt(1) == 'R' && s.charAt(2) == 'S') {
            System.out.println(2);
            return;
        }

        if (s.charAt(0) == 'S' && s.charAt(1) == 'S' && s.charAt(2) == 'S') {
            System.out.println(0);
            return;
        }

        System.out.println(1);
    }
}
