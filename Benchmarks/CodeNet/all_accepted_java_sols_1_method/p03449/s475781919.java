import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum1[] = new int[n + 1];
        int sum2[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            sum1[i] = sum1[i - 1] + sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            sum2[i] = sum2[i - 1] + sc.nextInt();
        }
        int max = 0;
        for (int i = 1; i <= n; i++) {
            max = Math.max(max, sum1[i] + sum2[n] - sum2[i - 1]);
        }
        System.out.println(max);
    }
}