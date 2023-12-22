import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nums = new int[3];
    String result;
    for (int cnt = 0; cnt < 3; cnt++) {
      nums[cnt] = sc.nextInt();
    }
    Arrays.sort(nums);
    result = (nums[0] == 5 && nums[1] == 5 && nums[2] == 7) ? "YES" : "NO";
    System.out.println(result);
    sc.close();
  }
}