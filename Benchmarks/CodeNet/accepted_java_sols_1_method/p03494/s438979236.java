import java.util.*;
public class Main {
  public static void main(String[] args) {
    int count = 0;
    Scanner sc = new java.util.Scanner(System.in);
    int leng = Integer.parseInt(sc.nextLine());
    String [] nums = sc.nextLine().split(" ");
    int evenCount = 0;
    for (String num: nums) {
      if (Integer.parseInt(num) % 2 == 0) {
        evenCount++;
      }
    }
    while (evenCount == nums.length) {
      evenCount = 0;
      count++;
      for (int i = 0; i < nums.length; i++) {
        nums[i] = String.valueOf(Integer.parseInt(nums[i]) / 2);
      }
      for (String num: nums) {
        if (Integer.parseInt(num) % 2 == 0) {
          evenCount++;
        }
      }
    }
    System.out.println(count);
  }
}
