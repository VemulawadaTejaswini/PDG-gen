import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(sc.next());
            a[i] = temp;
            sum += temp;
        }
        Arrays.sort(a);
        for (int i = n - 1; i >= n - m; i--) {
            if (a[i] < sum * 1.0 / (4 * m)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}