import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] sumMod = new int[N+1];
    for (int i = 1; i <= N; i++) {
      int A = sc.nextInt();
      sumMod[i] = (A+sumMod[i-1])%M;
    }
    
    Map<Integer, Integer> map = new HashMap<>();
    long ans = 0;
    for (int i = 0; i <= N; i++) {
      int count = map.getOrDefault(sumMod[i], 0);
      ans += count;
      map.put(sumMod[i], count+1);
    }
    
    System.out.println(ans);
  }
}
