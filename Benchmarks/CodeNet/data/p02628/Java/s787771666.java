import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        Arrays.sort(prices);

        int price = 0;
        for (int i = 0; i < k; i++) {
            price += prices[i];
        }

        System.out.println(price);
    }
}
