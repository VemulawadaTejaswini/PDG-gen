import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    sc.next();
    String[] result = new String[2 * h];
    for (int i = 0; i < h; i++) {
      String tmp = sc.next();
      result[2 * i] = tmp;
      result[2 * i + 1] = tmp;
    }
    sc.close();

    for (int i = 0; i < 2 * h; i++) {
      System.out.println(result[i]);
    }
  }
}
