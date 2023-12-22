import java.util.Scanner;

/**
 * Strings
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            String S = sc.next();
            String T = sc.next();

            System.out.println(T + S);
        }
    }

}
