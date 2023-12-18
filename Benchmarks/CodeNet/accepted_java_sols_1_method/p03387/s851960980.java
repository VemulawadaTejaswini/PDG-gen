import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nums = new int[3];
    for (int i = 0; i < 3; i++) {
      nums[i] = sc.nextInt();
    }
    Arrays.sort(nums);
    int deltaMax = nums[2] - nums[0];
    int deltaMin = nums[2] - nums[1];
    if ((deltaMax % 2 == 0 && deltaMin % 2 == 0) 
                                                  || (deltaMax % 2 == 1 && deltaMin % 2 == 1) ) {
      System.out.println((deltaMax + deltaMin) / 2);
    } else {
      System.out.println((deltaMax + deltaMin) / 2 + 2);
    }
  }
}
