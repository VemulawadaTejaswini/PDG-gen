
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        double[] v = new double[N];

        for (int i = 0 ; i < N ; i++) {
            v[i] = scanner.nextDouble();
        }

        Arrays.sort(v);

        for (int i = 0 ; i < N - 1 ; i++) {
            v[i + 1] = (v[i] + v[i + 1]) / 2.0;
        }

        System.out.println(v[N - 1]);
    }
}
