import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()){
      int N = in.nextInt();
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;

      for (int i = 0; i < N; ++i) {
        int a = in.nextInt();
        min = Math.min(min, a);
        max = Math.max(max, a);
      }

      System.out.println(max - min);
    }
  }
}