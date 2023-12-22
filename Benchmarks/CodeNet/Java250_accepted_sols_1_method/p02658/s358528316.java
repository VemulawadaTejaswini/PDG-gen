import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] nums = new long[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextLong();
        }
        Arrays.sort(nums);
        long ans = nums[0];
        if (ans == 0) {
            System.out.println(0);
        } else {
            boolean over = false;
            for (int i = 1; i < N; i++) {
                ans *= nums[i];
                if (1000000000000000000L < ans || ans <= 0) {
                    System.out.println(-1);
                    over = true;
                    break;
                }
            }
            if (!over) {
                System.out.println(ans);
            }
        }
    }
}