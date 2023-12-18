import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pieces = sc.nextInt();
        int m = sc.nextInt();

        if (pieces >= m) System.out.println(0);
        else {
            int[] arr = new int[m];
            for (int i = 0; i < m; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            int[] diffs = new int[m-1];
            for (int i = 1; i < m; i++) {
                diffs[i-1] = Math.abs(arr[i] - arr[i-1]);
            }
            Arrays.sort(diffs);
            
            int res = 0;
            for (int i = 0; i < m - pieces; i++) {
                res += diffs[i];
            }
            System.out.println(res);
        }
    }
}