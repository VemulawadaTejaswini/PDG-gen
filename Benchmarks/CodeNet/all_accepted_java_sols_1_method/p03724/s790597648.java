import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] v = new int[N];
    for (int i = 0; i < M; i++) {
      v[sc.nextInt()-1]++;
      v[sc.nextInt()-1]++;
    }
    boolean ans = true;
    for (int i = 0; i < N; i++) {
      if (v[i]%2 != 0) {
        ans = false;
        break;
      }
    }
    System.out.println(ans ? "YES" : "NO");
  }
}