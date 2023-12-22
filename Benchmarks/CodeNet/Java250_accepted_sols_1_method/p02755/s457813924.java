import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    sc.close();

    for (int i = 1; i < 2000; i++) {
      if ((int) (i * 0.08) == a && (int) (i * 0.1) == b) {
        System.out.println(i);
        System.exit(0);
      }
    }

    System.out.println(-1);
  }
}