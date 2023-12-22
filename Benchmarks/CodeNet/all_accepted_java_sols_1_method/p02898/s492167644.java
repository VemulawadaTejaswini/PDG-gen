
import java.util.Scanner;

/**
 * @author author
 *
 */
public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int K = Integer.parseInt(sc.next());


    int[] h = new int[N];
    int count = 0;
    for (int i = 0; i < N; i++) {
      h[i] = Integer.parseInt(sc.next());
      if (h[i] >= K) {
        count++;
      }
    }

    System.out.println(count);

  }

}
