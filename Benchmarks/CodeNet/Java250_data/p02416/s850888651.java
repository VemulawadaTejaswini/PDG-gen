import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    while (true) {
      String x = stdin.next();
      if (x.equals("0")) {
        break;
      }

      int sum = 0;
      int len = x.length();
      for (int i = 0; i < len; i++) {
        sum += Character.getNumericValue(x.charAt(i));
      }
      System.out.println(sum);
    }
  }

}