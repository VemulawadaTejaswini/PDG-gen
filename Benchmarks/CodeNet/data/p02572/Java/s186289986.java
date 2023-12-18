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
        List<Long> modNums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                modNums.add(((long)nums[i] * nums[j]) % mod);
            }
        }
        if (modNums.size() == 1) {
            System.out.println(modNums.get(0));
        } else {
            long ans = (modNums.get(0) + modNums.get(1)) % mod;
            for (int i = 2; i < modNums.size(); i++) {
                ans = (ans + modNums.get(i)) % mod;
            }
            System.out.println(ans);
        }
	}
}