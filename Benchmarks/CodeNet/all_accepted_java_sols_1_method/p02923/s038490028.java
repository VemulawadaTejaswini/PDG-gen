import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] H = new int[N];

    for (int i = 0; i < N; i++) {
      H[i] = sc.nextInt();
    }

    sc.close();

    int count = 0;
    int max = 0;

    for (int i = 0; i < N; i++) {
      if (i != N - 1) {
        if (H[i] >= H[i+1]) {
          count++;
        } else {
          max = Math.max(max, count);
          count = 0;
        }
      } else {
        max = Math.max(max, count);
      }
    }

    System.out.println(max);

  }

}