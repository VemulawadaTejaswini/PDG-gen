import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(sc.next());
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (min > nums[i]) min = nums[i];
            if (max < nums[i]) max = nums[i];
            sum += nums[i];
        }
        System.out.println(min + " " + max + " " + sum);
    }
}
