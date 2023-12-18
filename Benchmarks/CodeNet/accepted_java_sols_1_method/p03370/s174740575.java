import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int m[] = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }
        Arrays.sort(m);
        int sum[] = new int[n];
        sum[0] = m[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + m[i];
        }

        int dounut = 0;
        if (x >= sum[n - 1]) {
            dounut = n + (x - sum[n - 1]) / sum[0];
        } else {
            for (int i = 0; i < n; i++) {
                if (m[i] > x) {
                    dounut = i - 1;
                    break;
                }
            }
        }
        System.out.println(dounut);
    }
}