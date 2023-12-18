import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(a);
        long min = Integer.MAX_VALUE;
        int pos = 0;

        for (int j = a[0]; j <= a[n - 1]; j++) {
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += Math.abs(a[i] - j) * Math.abs(a[i] - j);

            }
            if (sum < min) {
                min = sum;
                pos = j;
            }
        }
        System.out.println(min);

    }
}