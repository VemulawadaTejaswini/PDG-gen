import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] price = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }
        Arrays.sort(price);
        for (int i = 0; i < k; i++) {
            sum += price[i];
        }
        System.out.println(sum);
    }
}