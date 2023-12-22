import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        int[] nums = {a,b,c};
        Arrays.sort(nums);
        int n_times = 0;
        for (int i = 0; i < n; i++) {
            nums[2] = nums[2] * 2;
        }
        System.out.println(nums[0] + nums[1] + nums[2]);
    }
}
