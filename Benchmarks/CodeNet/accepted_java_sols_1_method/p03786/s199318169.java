import java.util.Arrays;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        long size = 0;
        int last = 0;
        for (int i = 0; i < n - 1; i++) {
            size += a[i];
            if (2 * size < a[i + 1]) {
                last = i + 1;
            }
        }
        System.out.println(n - last);
    }
}