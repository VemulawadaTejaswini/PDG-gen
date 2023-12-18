import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String S = scanner.nextLine();
    String T = scanner.nextLine();
    if(T.length() == S.length() + 1 && T.startsWith(S)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}