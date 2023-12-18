import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        Arrays.sort(a);
        long ans = a[n - 1];
        long count = 2;
        for (int i = n - 2; i >= 0; i--) {
            if (count == n) {
                break;
            }
            ans += a[i];
            count++;
            if (count == n) {
                break;
            }
            ans += a[i];
            count++;
        }

        System.out.println(ans);
    }
}