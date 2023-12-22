import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str = sc.next();
    StringBuilder ret = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      ret.append("x");
    }
    System.out.println(ret.toString());
  }
}
