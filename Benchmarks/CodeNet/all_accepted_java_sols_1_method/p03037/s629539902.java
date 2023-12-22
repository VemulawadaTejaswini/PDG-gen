import java.util.Scanner;

/**
 * Prison
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int L_MAX = 0;
            int R_MIN = N + 1;
            for (int i = 0; i < M; i++) {
                L_MAX = Math.max(L_MAX, sc.nextInt());
                R_MIN = Math.min(R_MIN, sc.nextInt());
            }

            if (L_MAX <= R_MIN) {
                System.out.println(R_MIN - L_MAX + 1);
            } else {
                System.out.println(0);
            }
        }
    }

}
