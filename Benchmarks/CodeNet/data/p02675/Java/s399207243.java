import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    if (n.charAt(n.length()-1) == '3') {
      System.out.println("bon");
    } else if (n.charAt(n.length()-1) == '0' || n.charAt(n.length()-1) == '1' || n.charAt(n.length()-1) == '6' || n.charAt(n.length()-1) == '8') {
      System.out.println("pon");
    } else {
      System.out.println("hon");
    }
    sc.close();
  }
}