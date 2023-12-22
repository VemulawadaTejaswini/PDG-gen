import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(sc.next());
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i != 0) {
               System.out.print(nums[i] + " ");
            } else {
                System.out.println(nums[i]);
            }
        }
    }
}
