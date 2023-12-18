import java.util.*;

public class Main {
  private static final String STR_YES = "Yes";
  private static final String STR_NO = "No";
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    System.out.println(isValidFormula(a, b, c));
  }

  private static String isValidFormula(int a, int b, int c) {
    if (a < b && b < c) {
      return STR_YES;
    }
    return STR_NO;
  }
}