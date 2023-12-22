import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();

    sc.close();

    int current = 1;

    for (int i = 0; i < N; i++) {
      if (current < K) {
        current = current * 2;
      } else {
        current += K;
      }
    }

    System.out.println(current);

  }

}