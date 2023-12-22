import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    long tmp = 0;

    for (int i = 0; i < s.length(); i++) {
      tmp += Character.getNumericValue(s.charAt(i));
    }

    if ((tmp % 9) == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}