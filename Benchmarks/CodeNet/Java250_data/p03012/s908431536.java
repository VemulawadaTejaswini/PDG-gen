import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] weight = new int[n];
        for (int i = 0; i < n; i++) {
            weight[i] = Integer.parseInt(sc.next());
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int left_sum = 0;
            int right_sum = 0;
            for (int j = 0; j <= i; j++) {
                left_sum += weight[j];
            }
            for (int j = i + 1; j < n; j++) {
                right_sum += weight[j];
            }
            if (min > Math.abs(left_sum - right_sum)) {
                min = Math.abs(left_sum - right_sum);
            }
        }
        System.out.println(min);
    }
}