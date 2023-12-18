import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] p = new int[N];
    for (int i = 0; i < N; i++) {
      p[i] = sc.nextInt();
    }
    Arrays.sort(p);
    int ans = 0;
    for (int i = 0; i < N - 1; i++) {
      ans += p[i];
    }
    ans += p[N - 1] / 2;
    System.out.println(ans); 
  }
}