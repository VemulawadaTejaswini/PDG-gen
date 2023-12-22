import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    int intN = Integer.parseInt(N);
    int sum =0;
    for (int i=0; i<N.length(); i++) {
      sum +=  Character.getNumericValue(N.charAt(i));
    }
    if (intN % sum == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}