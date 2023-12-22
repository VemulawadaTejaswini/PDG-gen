import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());
        int C = Integer.parseInt(scanner.next());
        int K = Integer.parseInt(scanner.next());
        scanner.close();

        Integer[] arr = {A, B, C};
        Arrays.sort(arr, Comparator.reverseOrder());

        for (int i = 0; i < K; i++) {
            arr[0] *= 2;
        }

        int sum = 0;
        for (Integer integer : arr) {
            sum += integer;
        }

        System.out.println(sum);
    }
}
