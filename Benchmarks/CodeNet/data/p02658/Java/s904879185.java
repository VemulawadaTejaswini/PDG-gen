import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        BigDecimal[] nums = new BigDecimal[N];
        for (int i = 0; i < N; i++) {
            nums[i] = new BigDecimal(sc.next());
        }
        Arrays.sort(nums);
        BigDecimal ans = nums[0];
        if (ans.longValue() == 0) {
            System.out.println(0);
        } else {
            boolean over = false;
            for (int i = 1; i < N; i++) {
                ans = ans.multiply(nums[i]);
                if (1000000000000000000L < ans.longValue() || ans.longValue() < 0) {
                    System.out.println(-1);
                    over = true;
                    break;
                }
            }
            if (!over) {
                System.out.println(ans.longValue());
            }
        }
    }
}