import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n + 2];
        a[0] = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        a[n + 1] = 0;
        int sum = 0;
        for (int i = 1; i <= n + 1; i++) {
            sum += Math.abs(a[i] - a[i - 1]);
        }
        for (int i = 1; i <= n; i++) {
            if ((a[i] >= a[i - 1] && a[i] <= a[i + 1]) || (a[i] <= a[i - 1] && a[i] >= a[i + 1])) {
                System.out.println(sum);
            } else if (Math.abs(a[i] - a[i - 1]) < Math.abs(a[i] - a[i + 1])) {
                System.out.println(sum - 2 * Math.abs(a[i] - a[i - 1]));
            } else {
                System.out.println(sum - 2 * Math.abs(a[i] - a[i + 1]));
            }
        }
    }
}