import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    char endChar = N.charAt(N.length() - 1);

    if (endChar == '2' || endChar == '4' || endChar == '5' || endChar == '7' || endChar == '9') {
      System.out.println("hon");
    }
    if (endChar == '0' || endChar == '1' || endChar == '6' || endChar == '8') {
      System.out.println("pon");
    }
    if (endChar == '3') {
      System.out.println("bon");
    }
  }
}
