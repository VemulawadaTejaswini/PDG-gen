import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (n == 0 && m == 0) {
                break;
            }
            int[] arr = new int[m + 1];
            for (int i = 0; i < n; i++) {
                int d = sc.nextInt();
                int x = sc.nextInt();
                arr[d] = Math.max(arr[d], x);
            }
            long total = 0;
            for (int i = 1; i <= m; i++) {
                total += arr[i];
            }
            sb.append(total).append("\n");
        }
        System.out.print(sb);
    }
}

