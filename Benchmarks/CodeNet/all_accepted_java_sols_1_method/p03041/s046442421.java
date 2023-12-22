import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    String s = scan.next();
    System.out.println(s.substring(0, k - 1) + s.substring(k - 1, k).toLowerCase() + s.substring(k));
  }
}