
import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int L = sc.nextInt();
    String[] S = new String[N];
    for (int i = 0; i < N; i++) {
      S[i] = sc.next();
    }

    Arrays.sort(S);
    StringBuilder sb = new StringBuilder();
    for (String s : S) {
      sb.append(s);
    }

    System.out.println(sb.toString());
  }
}