import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String w, t;
    int count = 0;

    w = sc.next();
    while (1 > 0) {
      t = sc.next();
      if (t.equalsIgnoreCase(w)) {
        count++;
      } else if (t.equals("END_OF_TEXT")) {
        break;
      }
    }

    System.out.println(count);
    sc.close();
  }
}

