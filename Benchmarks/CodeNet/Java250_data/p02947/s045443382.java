import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Map<String, Integer> mm = new HashMap<>();
    for (int i = 0; i < N; i++) {
      char[] a = sc.next().toCharArray();
      Arrays.sort(a);
      String s = Arrays.toString(a);
      mm.put(s, mm.getOrDefault(s, 0) + 1);
    }
    
    long ans = 0;
    for (int v : mm.values()) {
      if (v >= 2) {
        ans += sum(v-1);
      }
    }
    
    System.out.println(ans);
  }
  
  private static long sum(int v) {
    if (v == 1) {
      return 1;
    }
    return v + sum(v-1);
  }
}
