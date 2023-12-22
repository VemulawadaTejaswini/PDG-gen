
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] s = scanner.next().toCharArray();

    if(s[2] == s[3] && s[4] == s[5]) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
