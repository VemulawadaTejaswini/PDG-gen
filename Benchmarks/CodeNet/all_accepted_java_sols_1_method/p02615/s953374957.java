import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Integer[] members = new Integer[n];
    long ans = 0;
    for (int i = 0; i < n; i++) {
      members[i] = sc.nextInt();
    }
    // 木構造で親の分だけ点数を足す
    Arrays.sort(members, Collections.reverseOrder());
    for (int i = 0; i < n; i++) {
      if (i == 0) {continue;}
      ans += members[i / 2];
    }
    System.out.println(ans);
  }
}
