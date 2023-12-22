import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        String c = scan.nextLine();

        char turn = 'a';

        while (true) {
            if (turn == 'a') {

                if (a.length() == 0) {
                    System.out.println('A');
                    System.exit(0);
                }
                turn = a.charAt(0);
                a = a.substring(1);

            } else if (turn == 'b') {

                if (b.length() == 0) {
                    System.out.println('B');
                    System.exit(0);
                }
                turn = b.charAt(0);
                b = b.substring(1);

            } else {

                if (c.length() == 0) {
                    System.out.println('C');
                    System.exit(0);
                }
                turn = c.charAt(0);
                c = c.substring(1);

            }
        }
    }
}
