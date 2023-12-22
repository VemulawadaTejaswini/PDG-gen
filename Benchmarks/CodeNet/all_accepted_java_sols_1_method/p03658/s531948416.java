import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int[] nums = new int[a];
        for (int i = 0; i < a; i++) {
            nums[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(nums);
        int ans = 0;
        int end = a - b;
        for (int i = a - 1; i > end - 1; i--) {
            ans += nums[i];
        }
        System.out.println(ans);
    }
}