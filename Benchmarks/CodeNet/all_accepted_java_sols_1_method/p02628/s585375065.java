import java.util.*;
import java.math.BigInteger;
 
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }

        Arrays.sort(nums);

        int ans = 0;

        for (int i = 0; i < k; i++) {
            ans += nums[i];
        }

        System.out.println(ans);
    }
}