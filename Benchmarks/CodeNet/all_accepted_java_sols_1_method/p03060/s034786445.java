import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    ArrayList<Integer> V = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      V.add(scn.nextInt());
    }
    int ans = 0;
    for (int i = 0; i < N; i++) {
      int C = scn.nextInt();
      if (V.get(i) > C) {
        ans += V.get(i) - C;
      }
    }

    System.out.println(ans);

  }

}
