import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int l = 1, r = 1000000007;
        while (l < r) {
            int mid = l + (r - l) / 2;
            boolean check = check(nums, k, mid);
            if (check) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        System.out.println(l);
    }

    private static boolean check(int[] nums, int k, int mid) {
        int req = 0;
        for (int num : nums) {
            if (num > mid) {
                req += Math.ceil((double) num / mid) - 1;
            }
        }
        return req <= k;
    }
}