import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    System.out.print(s.substring(0,5));
    System.out.print(" ");
    System.out.print(s.substring(6,13));
    System.out.print(" ");
    System.out.println(s.substring(14,19));
  }
}
