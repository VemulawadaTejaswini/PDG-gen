import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    if (Integer.parseInt(s.substring(5, 7)) < 5) System.out.println("Heisei");
    else System.out.println("TBD");
  }
}