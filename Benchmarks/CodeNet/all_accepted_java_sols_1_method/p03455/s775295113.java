import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] nums = sc.nextLine().split(" ");
    if (Integer.parseInt(nums[0]) * Integer.parseInt(nums[1]) % 2 == 0) {
      System.out.println("Even");
    }  else {
      System.out.println("Odd");
    }
  }
}
