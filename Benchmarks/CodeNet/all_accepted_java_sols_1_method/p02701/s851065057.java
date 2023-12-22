import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String[] S = new String[N];
    for (int i = 0; i < N; i++) S[i] = sc.next();
    sc.close();

    Set<String> set = new HashSet<>();
    for (int i = 0; i < N; i++) set.add(S[i]);

    int ans = set.size();
    System.out.println(ans);
  }
}
