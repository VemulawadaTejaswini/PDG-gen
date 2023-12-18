import java.util.*;

/**
 * Grading
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        out_of_loop: while (true) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());

            if (a == -1 && b == -1 && c == -1) {
                break out_of_loop;
            }

            if (a == -1 || b == -1) {
                System.out.println("F");
            } else if (a + b >= 80) {
                System.out.println("A");
            } else if (a + b >= 65) {
                System.out.println("B");
            } else if (a + b >= 50) {
                System.out.println("C");
            } else if (a + b >= 30) {
                if (c >= 50) {
                    System.out.println("C");
                } else {
                    System.out.println("D");
                }
            } else {
                System.out.println("F");
            }
        }
        sc.close();
    }
}
