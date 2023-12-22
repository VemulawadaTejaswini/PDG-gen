import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2 * n];
        for (int i = 1; i <= 2 * n; i++) {
            arr[i - 1] = i;
        }
        int[] next = new int[2 * n];
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            if (x == 0) {
                for (int j = 0; j < n; j++) {
                    next[2 * j] = arr[j];
                    next[2 * j + 1] = arr[n + j];
                }
            } else {
                System.arraycopy(arr, x, next, 0, 2 * n - x);
                System.arraycopy(arr, 0, next, 2 * n - x, x);
            }
            System.arraycopy(next, 0, arr, 0, 2 * n);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2 * n; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.print(sb);
    }
}

