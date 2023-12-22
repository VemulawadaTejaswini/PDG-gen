import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n];

        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }
        Arrays.sort(price);

        int ans = 0;

        for (int i = 0; i < k; i++) {
            ans += price[i];
        }

        System.out.println(ans);
    }
}