import java.util.*;

public class Main {

  private static final int MAX_COUNT = 999;

  public static void main(String[] args) {
    Main m = new Main();
    m.exec();
  }

  private void exec() {
    Scanner scan = new Scanner(System.in);
    String n = scan.next();
    int num = Integer.parseInt(n);
    int sum = 0;
    for (int i = 0; i < n.length(); i++) {
      sum += Integer.parseInt(n.substring(i, i + 1));
    }
    if (num % sum == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

    scan.close();
  }
}