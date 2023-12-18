import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());
    int X = Integer.parseInt(sc.next());
    int Y = Integer.parseInt(sc.next());

    int xMax = X, yMin = Y;
    for (int i = 0; i < N; i++) {
      int x = Integer.parseInt(sc.next());
      if (xMax < x) {
        xMax = x;
      }
    }
    for (int i = 0; i < M; i++) {
      int y = Integer.parseInt(sc.next());
      if (yMin > y) {
        yMin = y;
      }
    }

    if (xMax < yMin) {
      System.out.println("No War");
    } else {
      System.out.println("War");
    }
  }
}