import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            nums[i] = sc.nextInt();
        }
        int[] A = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            A[i] = nums[i];
            A[i + 1] = nums[i];
            if (i != 0) {
                if (A[i] > nums[i - 1]) {
                    A[i] = nums[i - 1];
                }
            }
        }
        int sum = 0;
        for (int tmp : A) {
            sum += tmp;
        }
        System.out.println(sum);
    }
}
