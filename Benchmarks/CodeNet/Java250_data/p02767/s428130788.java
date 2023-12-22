import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        int min = 100;
        int max = 1;
        for (int i = 0; i < n; i ++){
            nums[i] = scan.nextInt();
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        int result = Integer.MAX_VALUE;
        for (int i = min; i <= max; i ++){
            int ans = 0;
            for (int j = 0; j < n; j ++){
                ans += Math.pow(nums[j] - i, 2);
            }
            result = Math.min(ans, result);
        }
        System.out.println(result);
    }
}
