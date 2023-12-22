import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int K = sc.nextInt();
    int S = sc.nextInt();

    sc.close();

    int count = 0;

    for (int i = 0; i <= K; i++) {
      for (int j = 0; j <= K; j++) {
        int k = S - i - j;
        if (k <= K && 0 <= k) {
          count++;
        }
      }
    }

    System.out.println(count);

  }

}