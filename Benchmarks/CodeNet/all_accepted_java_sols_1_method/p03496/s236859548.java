import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int min = Integer.MAX_VALUE;
        int minPoint = 0;
        int max = Integer.MIN_VALUE;
        int maxPoint = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (min > a[i]) {
                min = a[i];
                minPoint = i;
            }
            if (max < a[i]) {
                max = a[i];
                maxPoint = i;
            }
            min = Math.min(min, a[i]);
            max = Math.max(max, a[i]);
        }
        int changeNum = 0;
        int pos = 0;
        if (Math.abs(min) > Math.abs(max)) {
            changeNum = min;
            pos = minPoint;
        } else {
            changeNum = max;
            pos = maxPoint;
        }
        // n - 1回の処理
        for (int i = 0; i < n; i++) {
            if (i != pos) {
                a[i] += changeNum;
            }
        }
        // 正の数の処理
        if (changeNum > 0) {
            for (int i = 0; i < n - 1; i++) {
                a[i + 1] = a[i];
            }
        } else {
            for (int i = 0; i < n - 1; i++) {
                a[n - 2 - i] += a[n - 1 - i];
            }
        }
        System.out.println(2 * n - 2);
        // n - 1回の処理
        for (int i = 0; i < n; i++) {
            if (pos == i)
                continue;
            System.out.println((pos + 1) + " " + (i + 1));
        }
        if (changeNum > 0) {
            for (int i = 1; i < n; i++) {
                System.out.println(i + " " + (i + 1));
            }
        } else {
            for (int i = n; i > 1; i--) {
                System.out.println(i + " " + (i - 1));
            }
        }
    }
}