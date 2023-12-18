import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();

            int max = 0;
            int l = M / N;
            for (int n = l; n >= 1; n--) {
                if ((M - N * n) % n == 0) {
                    max = n;
                    break;
                }
            }

            System.out.println(max);
        }
    }
}
