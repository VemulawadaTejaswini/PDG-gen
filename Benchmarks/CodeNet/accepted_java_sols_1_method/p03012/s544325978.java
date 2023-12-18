import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            nums[i] = num;
            sum += num;
        }
        
        int sum2 = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            sum2 += nums[i];
            
            min = Math.min(min, Math.abs(sum - sum2 - sum2));
        }
        
        
        System.out.println(min);
        
    }
}