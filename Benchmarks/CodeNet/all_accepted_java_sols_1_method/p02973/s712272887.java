import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        arr[0] = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (arr[max] >= x) {
                max++;
                arr[max] = x;
               continue;
            }
            int left = 0;
            int right = max;
            while (right - left > 1) {
                int m = (left + right) / 2;
                if (arr[m] < x) {
                    right = m;
                } else {
                    left = m;
                }
            }
            arr[right] = x;
        }
        System.out.println(max);
        
    }
}