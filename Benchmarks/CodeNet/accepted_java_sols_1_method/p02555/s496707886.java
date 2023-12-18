import java.util.Scanner;

public class Main {
    
    private static final long MOD = 1_000_000_007;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int S = sc.nextInt();
        
        final long[] nums = new long[Math.max(S + 1, 6)];
        
        nums[0] = 0;
        nums[1] = 0;
        nums[2] = 0;
        nums[3] = 1;
        nums[4] = 1;
        nums[5] = 1;
        
        for (int i = 6; i <= S; i++) {
            nums[i] = nums[i - 3] + nums[i - 1];
            nums[i] %= MOD;
        }
        
        System.out.println(nums[S]);
    }
}
