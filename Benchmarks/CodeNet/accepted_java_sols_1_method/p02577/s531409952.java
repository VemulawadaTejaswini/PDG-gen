import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    char[] nums = s.toCharArray();

    int sum = 0;
    for (char num : nums) {
      sum += Integer.parseInt(String.valueOf(num));
    }

    if (sum % 9 == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}