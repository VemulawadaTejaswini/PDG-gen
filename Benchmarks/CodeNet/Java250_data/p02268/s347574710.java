
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] s = new int[n + 1];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }

        int q     = sc.nextInt();
        int count = 0;
        
        for (int i = 0; i < q; i++) {
            int target = sc.nextInt();
            int left = 0;
            int right = n - 1;
            while (right - left >= 0) {
                int mid = (left + right) / 2;
                if (s[mid] > target) {
                    right = mid - 1;
                } else if (s[mid] < target) {
                    left = mid + 1;
                } else {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
