import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] nums = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        System.out.println(i);
        break;
      }
    }


  }
}