import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n - 1];
    for (int i = 0; i < n - 1; i++) {
      nums[i] = sc.nextInt();
    }
    long sum = nums[0] + nums[nums.length - 1];
    for (int i = n - 3; i >= 0; i--) {
      sum += Math.min(nums[i], nums[i + 1]);
    }
    System.out.println(sum);
  }
}
