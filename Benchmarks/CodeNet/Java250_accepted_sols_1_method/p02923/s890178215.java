import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        int cnt = 0;
        int tmp = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        tmp = h[0];
        for (int i = 1; i < h.length; i++) {
            if (tmp >= h[i]) {
                cnt++;
            } else {
                cnt = 0;
            }
            tmp = h[i];
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }
}