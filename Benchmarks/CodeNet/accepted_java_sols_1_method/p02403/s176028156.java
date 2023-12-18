import java.util.*;

/**
 * PrintaRectangle
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        out_of_loop: while (true) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());

            if (a == 0 && b == 0) {
                break out_of_loop;
            }

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print("#");
                }
                System.out.println("");
            }
            System.out.println("");
        }
        sc.close();

    }
}
