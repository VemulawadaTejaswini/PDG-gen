import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long sum = 0;
    char[] n = sc.nextLine().toCharArray();
    for (int cnt = 0; cnt < n.length; cnt++) {
      sum += Character.getNumericValue(n[cnt]);
    }
    String ans = (sum % 9 == 0) ? "Yes" : "No";
    System.out.println(ans);
    sc.close();
  }
}