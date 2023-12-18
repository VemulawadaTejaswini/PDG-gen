import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int K = in.nextInt();

            int count = 1;
            for (int i = 0; i < N; i++) {
                if (i == 0) {
                    count *= K;
                } else {
                    count *= K - 1;
                }
            }

            System.out.println(count);
        }
    }
}
