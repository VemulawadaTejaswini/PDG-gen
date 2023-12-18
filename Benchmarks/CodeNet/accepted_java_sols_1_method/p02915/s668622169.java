import java.util.Scanner;

/**
 * Password
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            System.out.println(N * N * N);
        }
    }

}
