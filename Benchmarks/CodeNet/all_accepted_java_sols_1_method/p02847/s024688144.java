import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next(), W = "SUNMONTUEWEDTHUFRISAT";
    System.out.println(7 - W.indexOf(S) / 3);
  }
}