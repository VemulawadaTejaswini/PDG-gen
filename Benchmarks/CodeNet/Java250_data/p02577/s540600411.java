import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    long sum = 0;
    for (int i = 0; i < N.length(); i++) {
      sum += Character.getNumericValue(N.charAt(i));
    }
    if (sum % 9 != 0) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
  }
}
