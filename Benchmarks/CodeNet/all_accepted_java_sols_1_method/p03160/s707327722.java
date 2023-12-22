import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        int[] dp=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        dp[1]=Math.abs(nums[1]-nums[0]);
        for(int i=2;i<n;i++){
            dp[i]=Math.min(dp[i-1]+Math.abs(nums[i]-nums[i-1]),dp[i-2]+Math.abs(nums[i]-nums[i-2]));
        }
        System.out.println(dp[n-1]);

    }
}