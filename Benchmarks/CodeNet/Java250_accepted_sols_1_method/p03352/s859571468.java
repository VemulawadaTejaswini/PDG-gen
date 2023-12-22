import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[1000];
        a[0] = 1;
        for (int i = 2; i < n; i++) {
            int max = i * i;
            if (max <= n) {
                do {
                    max *= i;
                } while (max <= n);
                max /= i;
                a[i-1] = max;
            }
        }

        Arrays.sort(a);
        System.out.print(a[999]);
    }
}
