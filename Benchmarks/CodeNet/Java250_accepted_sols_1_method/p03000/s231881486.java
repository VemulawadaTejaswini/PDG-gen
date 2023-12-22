import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int[] L = new int[N+1];
    int distance = 0, ans = 0;
    for (int i=1; i<=N; i++) {
      L[i] = sc.nextInt();
    }
    for (int i=1; i<=N; i++) {
      if (distance + L[i] > X) {
        ans = i;
        break;
      }
      if ( i == N) {
        ans = i+1;
      }
      distance += L[i];
    }
     System.out.println(ans);
  }
}