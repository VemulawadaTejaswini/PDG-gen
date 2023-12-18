import java.util.*;

public class Main {
  public static void main(String[] srgs) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    final long t = Long.parseLong(sc.next());
    int[] time = new int[n];
    long ans = 0;
    for(int i = 0; i < n; i++) {
      time[i] = Integer.parseInt(sc.next());
    }
    for(int i = 0; i < n - 1; i++) {
      ans += Math.min(time[i+1] - time[i], t);
    }
    System.out.println(ans + t);
  }
}
