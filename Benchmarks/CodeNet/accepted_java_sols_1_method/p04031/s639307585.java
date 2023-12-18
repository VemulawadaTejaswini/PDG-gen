import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        Arrays.sort(nums);
        
        int min = nums[0];
        int max = nums[n - 1];
        if (min == max) {
            System.out.println("0");
            return;
        }
        
        int answer = Integer.MAX_VALUE;
        for (int i = min; i <= max; i++) {
            int sum = 0;
            for (int num : nums) {
                sum += (int)Math.pow(num - i, 2);
            }
            
            answer = Math.min(answer, sum);
        }
        
        System.out.println(answer);
    }
}
