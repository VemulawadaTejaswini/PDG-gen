import java.util.*;
import java.util.function.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] P = new int[N];
    for (int i = 0; i < N; i++) P[i] = sc.nextInt();
    sc.close();

    int min = P[0];
    int ans = 0;
    for (int i = 0; i < N; i++) {
      if (min < P[i]) continue;
      min = P[i];
      ans++;
    }
    
    System.out.println(ans);
  }
}