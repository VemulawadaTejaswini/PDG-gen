import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();

    int[] H = new int[N];
    for (int i = 0; i < N; i++) {
      H[i] = scn.nextInt();
    }

    boolean flg = true;
    for (int i = N - 2; i >= 0; i--) {
      if (H[i] - H[i + 1] > 1) {
        flg = false;
        break;
      }

      if (H[i] - H[i + 1] == 1) {
        H[i]--;
      }
    }

    System.out.println(flg ? "Yes" : "No");
  }
}