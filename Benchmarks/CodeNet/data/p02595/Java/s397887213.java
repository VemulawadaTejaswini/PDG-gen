
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int D = scanner.nextInt();
        int[] X = new int[N];
        int[] Y = new int[N];
        int count = 0;

        for (int i = 0 ; i < N ; i++) {
            X[i] = scanner.nextInt();
            Y[i] = scanner.nextInt();

            double distance = Math.sqrt(X[i] * X[i] + Y[i] * Y[i]);
            if (distance <= D) {
                count++;
            }
        }

        System.out.println(count);
    }
}
