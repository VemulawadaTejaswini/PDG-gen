import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        nums = Arrays.stream(nums).boxed()
                .sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();
        long ans = 0;
        int ptr = 0, cnt = 1;
        for (int i = 1; i < n; i++) {
            ans += nums[ptr];
            cnt++;
            if (cnt == 2) {
                ptr++;
                cnt = 0;
            }
        }
        System.out.println(ans);
    }
}