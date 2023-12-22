import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String S = scan.nextLine();
    String tmp = S.replace(String.valueOf(S.charAt(0)), "");
    if (tmp.length() == 2 && tmp.charAt(0) == tmp.charAt(1)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
