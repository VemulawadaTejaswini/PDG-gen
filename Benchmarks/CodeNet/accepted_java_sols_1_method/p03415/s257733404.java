import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String C1 = sc.next();
    String C2 = sc.next();
    String C3 = sc.next();

    StringBuffer result = new StringBuffer();
    result.append(C1.charAt(0));
    result.append(C2.charAt(1));
    result.append(C3.charAt(2));
    System.out.println(result.toString());

  }
}
