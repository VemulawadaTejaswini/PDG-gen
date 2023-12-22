import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(sc.next());
        }
        int endIndex = 2;
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            if (endIndex + 1 > n) break;
            if ((nums[i] > nums[i - 1] && nums[i] < nums[endIndex]) || (nums[i] < nums[i - 1] && nums[i] > nums[endIndex])) {
                cnt++;
            }
            endIndex++;
        }
        System.out.println(cnt);
    }
}
