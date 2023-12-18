import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int min = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (i == 0) {
                min = a[i];
                max = a[i];
                continue;
            }
            if (min > a[i]) {
                min = a[i];
            }
            if (max < a[i]) {
                max = a[i];
            }
        }

        double minCost = 0;
        for (int i = min; i < max; i++) {
            double cost = 0;
            for (int j = 0; j < n; j++) {
                cost += Math.pow(a[j] - i, 2);
            }
            if (i == min) {
                minCost = cost;
                continue;
            }
            if (cost < minCost) {
                minCost = cost;
            }
        }
        System.out.println((int) minCost);
    }

}
