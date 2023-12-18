import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mod = 1000000007;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        long ans = 0;
        long p = 0;
        for (int i = 0; i < n; i++) {
            ans = (ans + ((long) nums[i] * p ) % mod) % mod;
            p = (nums[i] + p) % mod; 
        }
        System.out.println(ans);
	}
}