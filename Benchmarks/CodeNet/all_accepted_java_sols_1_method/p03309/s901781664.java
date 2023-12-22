import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            nums[i] = num - (i + 1);
        }
        
        Arrays.sort(nums);
        int median = 0;
        if (nums.length % 2 == 0) {
            median = (nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2;
        } else {
            median = nums[nums.length / 2];
        }
        
        long minSum = 0;
        for (int num : nums) {
            minSum += Math.abs(num - median);
        }
        
        System.out.println(minSum);
    }
}
