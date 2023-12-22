import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = (double) (scanner.nextInt() + 1) / 2;
        }
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += array[i];
        }
        double max = sum;

        for (int i = 0; i < n - k; i++) {
            sum += array[i + k] - array[i];
            if (max < sum) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}