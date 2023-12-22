import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    int Q = scn.nextInt();
    scn.nextLine();
    String S = scn.nextLine();

    int[] L = new int[N];
    L[0] = 0;
    for (int i = 1; i < N; i++) {

      if (S.substring(i - 1, i + 1).equals("AC")) {
        L[i] = L[i - 1] + 1;
      } else {
        L[i] = L[i - 1];
      }
    }

    for (int i = 0; i < Q; i++) {
      int l = scn.nextInt() - 1;
      int r = scn.nextInt() - 1;
      System.out.println(L[r] - L[l]);
    }

  }
}