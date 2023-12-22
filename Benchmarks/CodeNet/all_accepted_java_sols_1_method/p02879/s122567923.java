import java.util.Scanner;

/**
 * 9x9
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            if (A < 10 && B < 10) {
                System.out.println(A * B);
            } else {
                System.out.println(-1);
            }
        }
    }

}
