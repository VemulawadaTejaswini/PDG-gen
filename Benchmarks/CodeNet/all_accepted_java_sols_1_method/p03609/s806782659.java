import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = Integer.parseInt(sc.next());
    int t = Integer.parseInt(sc.next());

    int msg = 0;
    if (X > t) {
      msg = X - t;
    }

    System.out.println(msg);

  }
}
