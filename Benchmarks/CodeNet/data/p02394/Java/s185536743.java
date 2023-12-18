import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    String[] nums = line.split(" ");
    int W = Integer.parseInt(nums[0]);
    int H = Integer.parseInt(nums[1]);
    int x = Integer.parseInt(nums[2]);
    int y = Integer.parseInt(nums[3]);
    int r = Integer.parseInt(nums[4]);

    if(x + r > W || x - r < 0 || y + r > H || y - r < 0) {
      System.out.println("No");
    }else {
      System.out.println("Yes");
    }
  }
}

