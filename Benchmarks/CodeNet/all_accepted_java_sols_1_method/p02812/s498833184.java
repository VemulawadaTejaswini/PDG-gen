import java.util.Scanner;

/**
 * Count ABC
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            String S = sc.next();

            int c = 0;
            for (int i = 0; i < N - 2; i++) {
                if (S.substring(i, i + 3).equals("ABC")) {
                    c++;
                }
            }

            System.out.println(c);
        }
    }

}
