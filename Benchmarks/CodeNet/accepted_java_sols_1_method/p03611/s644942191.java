import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(1);
        } else if (n == 2) {
            int k = sc.nextInt();
            int l = sc.nextInt();
            if (Math.abs(k - l) <= 2) {
                System.out.println(2);
            } else {
                System.out.println(1);
            }
        } else {
            int nu[] = new int[100000];
            for (int i = 0; i < n; i++) {
                nu[sc.nextInt()]++;
            }
            int sum[] = new int[n - 2];
            for (int i = 0; i < n - 2; i++) {
                sum[i] = nu[i] + nu[i + 1] + nu[i + 2];
            }
            int max = 0;
            for (int i = 0; i < n - 2; i++) {
                max = Math.max(max, sum[i]);
            }
            System.out.println(max);
        }

    }
}
