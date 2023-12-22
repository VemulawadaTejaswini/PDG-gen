import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int X = in.nextInt();
      int count = 1;
      int pos = 0;
      
      for (int i = 0; i < N; ++i) {
        pos += in.nextInt();

        if (pos <= X) {
          ++count;
        }
      }

      System.out.println(count);
    }
  }
}