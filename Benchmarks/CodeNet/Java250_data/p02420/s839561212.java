import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    while (true) {
      String str = stdin.next();
      if (str.equals("-")) {
        break;
      }

      int m = stdin.nextInt();
      for (int i = 0; i < m; i++) {
        int h = stdin.nextInt();
        str = str.substring(h) + str.substring(0, h);
      }
      System.out.println(str);
    }
  }

}