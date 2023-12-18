import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double prod = 1;
        double[] arr = new double[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = scanner.nextDouble();
            prod *= arr[i];
            if (prod > 1000000000000000000D) {
//                System.out.println((long) prod);
                prod = -1;
                break;
            }
        }
        if (prod == -1D) {
            for (int i = 0; i < N; ++i) {
                if (arr[i] == 0)
                    prod = 0;
            }
        }
        System.out.println((long) prod);
    }
}
