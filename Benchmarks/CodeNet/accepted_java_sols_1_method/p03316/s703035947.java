import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String N = scanner.next();
    int SN = 0;
    for (int i = 0; i < N.length(); i++) {
      SN += Character.getNumericValue(N.charAt(i));
    }
    if (Integer.parseInt(N) % SN == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
