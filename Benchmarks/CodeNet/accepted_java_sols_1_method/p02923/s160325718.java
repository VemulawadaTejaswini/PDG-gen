import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] h = new double[n];
        
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < n - 1; i++) {
            if (max >= n - i - 1) {
                break;
            }
            int cnt = 0;
            for (int j = i + 1; j < n; j++) {
                if (h[j] <= h[j - 1]) {
                    cnt++;
                } else {
                    break;
                }
            }
            if (cnt > max) {
                max = cnt;
            }
        }
        System.out.println(max);
    }
}