import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int curr = a[0];
        int index = 1;
        int profit = 1000;
        int buyPrice = 0;
        int buyCount = 0;
        while (index < n) {
            while (index < n && curr >= a[index]) {
                curr = a[index++];
            }
            buyCount = profit / curr;
            buyPrice = curr;
            while (index < n && curr <= a[index]) {
                curr = a[index++];
            }
            profit += ((curr - buyPrice) * buyCount);
        }
        System.out.println(profit);
    }
}
