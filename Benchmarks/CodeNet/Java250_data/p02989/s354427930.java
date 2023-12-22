
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] d = new int[N];

        for (int i = 0 ; i < N ; i++) {
            d[i] = scanner.nextInt();
        }

        Arrays.sort(d);

        int low = d[N / 2 - 1];
        int high = d[N / 2];

        System.out.println(high - low);

    }
}
