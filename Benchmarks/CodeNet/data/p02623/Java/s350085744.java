

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n + 1];
        long[] b = new long[m + 1];
        int max = 0;
        for (int i = 1; i < n + 1; i++) {
            a[i] = a[i - 1] + sc.nextLong();
        }
        for (int i = 1; i < m + 1; i++) {
            b[i] = b[i - 1] + sc.nextLong();
        }
        for (int i = 0; i < n + 1; i++) {
            long diff = k - a[i];
            if (diff > 0) {
                int ans = binarySearch(0, b.length - 1, diff, b);
                max = Math.max(i + ans, max);
            }
        }
        System.out.println(max);
    }

    private static int binarySearch(int left, int right, long target, long[] arr) {
        if (right - left <= 1) {
            if (arr[right] <= target) {
                return right;
            } else {
                return left;
            }
        }
        int mid = left + ((right - left) / 2);
        if (arr[mid] > target) {
            return binarySearch(left, mid - 1, target, arr);
        } else {
            return binarySearch(mid, right, target, arr);
        }
    }
}