import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextLong();
        }

        long total = 0;
        int j = 0;
        while (j < m) {
            if (total + b[j] <= k) {
                total += b[j];
                j++;
            } else {
                break;
            }
        }

        int max = j;
        int i = 0;
        while (i < n) {
            total += a[i];
            i++;
            while (j > 0 && total > k) {
                j--;
                total -= b[j];
            }
            if (total < k) {
                break;
            }
            if (max < i + j) {
                max = i + j;
            }
        }
        System.out.println(max);
    }

}
