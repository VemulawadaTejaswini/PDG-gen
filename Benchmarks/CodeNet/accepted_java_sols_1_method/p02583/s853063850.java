import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[j] == nums[i]) continue;
                for (int k = j + 1; k < n; k++) {
                    if (nums[k] == nums[j] || nums[k] == nums[i]) continue;
                    long sum = nums[i] + nums[j];
                    if (sum > nums[k] && nums[k] - nums[j] < nums[i]) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}