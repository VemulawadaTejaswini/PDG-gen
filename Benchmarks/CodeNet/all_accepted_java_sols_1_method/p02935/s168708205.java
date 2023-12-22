import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            Arrays.sort(array);

            double res = (array[0] + array[1]) / 2.0;
            for (int i = 2; i < n; i++) {
                res = (res + array[i]) / 2.0;
            }
            System.out.println(res);
        }
    }
}

