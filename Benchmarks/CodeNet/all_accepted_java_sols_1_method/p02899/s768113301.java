import java.util.Scanner;

/**
 * Go to School
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int[] order = new int[N];
            for (int i = 0; i < N; i++) {
                order[A[i] - 1] = i + 1;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(order[0]);
            for (int i = 1; i < N; i++) {
                sb.append(" ").append(order[i]);
            }
            System.out.println(sb.toString());
        }
    }

}
