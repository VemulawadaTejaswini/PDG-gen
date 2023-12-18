import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();

    int sum = 0;

    for (int i = 0; i < n.length(); i++) {
      char c = n.charAt(i);
      String s = String.valueOf(c);
      int k = Integer.parseInt(s);
      sum += k;
    }

    if (Integer.parseInt(n) % sum == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }

}
