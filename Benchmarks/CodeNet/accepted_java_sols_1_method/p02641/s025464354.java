import java.util.*;
import java.util.stream.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int N = sc.nextInt();
    sc.nextLine();
    List<Integer> P = new ArrayList<>();
    for (int i = 0; i < N; i++) P.add(sc.nextInt());
    int ans = 0;
    int min = X;
    for (int i = 0; i <= 101; i++) {
      if (P.contains(i)) continue;
      if (min > Math.abs(X-i)) {
        ans = i;
        min = Math.abs(X-i);
      }
    }
    System.out.println(ans);
  }
}