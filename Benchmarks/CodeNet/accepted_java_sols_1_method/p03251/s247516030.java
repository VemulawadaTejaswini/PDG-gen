import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int M = in.nextInt();
      int X = in.nextInt();
      int Y = in.nextInt();
      int maxX = Integer.MIN_VALUE;
      int minY = Integer.MAX_VALUE;

      for (int i = 0; i < N; ++i) {
        maxX = Math.max(maxX, in.nextInt());
      }

      for (int i = 0; i < M; ++i) {
        minY = Math.min(minY, in.nextInt());
      }

      if (Y < X + 1) {
        System.out.println("War");
      } else {
        if (minY < maxX + 1) {
          System.out.println("War");
        } else if (minY < X + 1 || Y < maxX + 1) {
          System.out.println("War");
        } else {
          System.out.println("No War");
        }
      }
    }
  }
}