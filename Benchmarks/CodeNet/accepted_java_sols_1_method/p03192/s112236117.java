import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    int count = 0;
    if (N.charAt(0) == '2')
      count++;
    if (N.charAt(1) == '2')
      count++;
    if (N.charAt(2) == '2')
      count++;
    if (N.charAt(3) == '2')
      count++;
    System.out.println(count);
  }
}