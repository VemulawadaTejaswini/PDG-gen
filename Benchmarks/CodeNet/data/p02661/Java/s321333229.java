import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            b[i] = in.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        if (n % 2 == 1) {
            int start = a[n / 2];
            int end = b[n / 2];

            System.out.println(end - start + 1);
        } else {
            int start1 = a[n / 2 - 1];
            int end1 = b[n / 2 - 1];
            int start2 = a[n / 2];
            int end2 = b[n / 2];

            int start = (start2 + start1) / 2;
            int end = (end2 + end1) / 2;
            System.out.println((end - start) * 2 + 1);
        }
    }
}