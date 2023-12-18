import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int varieties = Integer.parseInt(sc.next());
        int buyCount = Integer.parseInt(sc.next());
        int[] prices = new int[varieties];
        for (int i = 0; i < varieties; i++) {
            prices[i] = Integer.parseInt(sc.next());
        }

        Arrays.sort(prices);

        int sum = 0;
        for (int i = 0; i < buyCount; i++) {
            sum += prices[i];
        }

        System.out.println(sum);
        sc.close();
    }
}
