import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int R = Integer.parseInt(sc.next());
    int G = Integer.parseInt(sc.next());

    int result = 2 * G - R;

    System.out.println(result);

  }
}
