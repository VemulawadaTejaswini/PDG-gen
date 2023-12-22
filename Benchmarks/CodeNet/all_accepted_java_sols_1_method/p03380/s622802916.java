import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(nums);

        int max = nums[n - 1];
        int mid = 0;

        for (int i = 0; i < n; i++) {
            if (mid < Math.min(nums[i], nums[n - 1] - nums[i])) {
                mid = nums[i];
            }
        }
        System.out.println(max + " " + mid);
    }
}