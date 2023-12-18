import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 2];
        a[0] = 0;
        a[n + 1] = 0;
        for (int i = 1; i < n + 1; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 1; i < n + 2; i++) {
            sum += Math.abs(a[i] - a[i - 1]);
        }
        for (int i = 1; i < n + 1; i++) {
            if (a[i - 1] <= a[i] && a[i] <= a[i + 1]) {
                System.out.println(sum);
            } else if (a[i - 1] >= a[i] && a[i] >= a[i + 1]) {
                System.out.println(sum);
            } else if (a[i - 1] <= a[i]) {
                if (a[i - 1] < a[i + 1]) {
                    int rest = a[i] - a[i + 1];
                    System.out.println(sum - (2 * rest));
                } else {
                    int rest = a[i] - a[i - 1];
                    System.out.println(sum - (2 * rest));
                }
            } else if (a[i - 1] > a[i]) {
                if (a[i - 1] <= a[i + 1]) {
                    int rest = a[i - 1] - a[i];
                    System.out.println(sum - (2 * rest));
                } else {
                    int rest = a[i + 1] - a[i];
                    System.out.println(sum - (2 * rest));
                }
            }
        }

    }
}
