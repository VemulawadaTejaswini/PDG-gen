import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] nums = new Integer[200000];
        Arrays.fill(nums, 0);
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            nums[num]++;
        }
        Arrays.sort(nums, Collections.reverseOrder());
        long sum = 0;
        for(int i = k; i < 200000; i++) {
            sum += nums[i];
        }
        System.out.println(sum);
    }
}
