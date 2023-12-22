import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String num = scan.nextLine();
      String[] strs = num.split("");
      int[] nums = new int[strs.length];
      int sum = 0;
      
      for (int i = 0; i < strs.length; i++) {
        nums[i] = Integer.parseInt(strs[i]);
        sum += nums[i];
      }
      
      if (sum % 9 == 0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }

      
      scan.close();
    }
}