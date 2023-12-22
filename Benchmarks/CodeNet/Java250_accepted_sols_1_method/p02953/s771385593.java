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

    String result = "Yes";

    for (int i = N - 1; 0 < i; i--) {
      if (H[i] < H[i - 1]) {
        if (H[i - 1] - H[i] <= 1) {
          H[i - 1] -= H[i - 1] - H[i];
        } else {
          result = "No";
          break;
        }
      }
    }

    System.out.println(result);

  }

}