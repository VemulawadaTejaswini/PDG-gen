import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      int len = String.valueOf(i).length();
      int digitSum = 0;
      for (int ii = 0; ii < len; ii++) {
        digitSum += Integer.parseInt(String.valueOf(i).substring(ii, ii + 1));
      }
      if (digitSum >= a && b >= digitSum) {
        sum += i;
      }
    }
    System.out.println(sum);
  }
}