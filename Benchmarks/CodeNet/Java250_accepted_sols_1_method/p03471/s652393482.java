import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int Y = sc.nextInt();

    sc.close();

    int x = -1;
    int y = -1;
    int z = -1;

    for (int i = 0; i <= N; i++) {
      for (int j = 0; j <= N - i; j++) {
        int k = N - i - j;
        int i_ = 10000 * i;
        int j_ = 5000 * j;
        int k_ = 1000 * k;
        if (i_ + j_ + k_ == Y) {
          x = i;
          y = j;
          z = k;
          break;
        }
      }
      if (x != -1) {
        break;
      }
    }

    System.out.println(x + " " + y + " " + z);

  }

}