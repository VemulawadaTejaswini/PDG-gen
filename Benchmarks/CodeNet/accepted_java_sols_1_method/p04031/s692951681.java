
import java.io.BufferedInputStream;
import java.util.*;

public class Main {

    // 1处理全为负数的情况
    // 2处理相同的数
    // 3正数
    // 4正数负数混合
    // 暴力试探
    public static void main(String[] args) {

        Scanner s = new Scanner(new BufferedInputStream(System.in));
        int n = s.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }
        int sum = Integer.MAX_VALUE;

        for (int i = -100; i <= 100; i++) {
            int cur = 0;
            for (int j : nums) {
                int o = Math.abs(j - i);
                o = o * o;
                cur += o;
            }
            sum = Math.min(sum, cur);
        }
        System.out.println(sum);

    }
}
