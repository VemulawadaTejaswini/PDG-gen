import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = in.nextInt();
            }

            Arrays.sort(a);

            int Alice = 0;
            int Bob = 0;
            boolean isAlice = true;
            for (int i = N - 1; i >= 0; i--, isAlice = !isAlice) {
                if (isAlice) {
                    Alice += a[i];
                } else {
                    Bob += a[i];
                }
            }

            System.out.println(Alice - Bob);
        }
    }
}
