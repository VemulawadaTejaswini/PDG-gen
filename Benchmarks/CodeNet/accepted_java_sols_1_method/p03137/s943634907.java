import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();

    int[] X = new int[M];
    for (int i = 0; i < M; i++) {
      X[i] = sc.nextInt();
    }

    Arrays.sort(X);
    int[] diff = new int[M-1];
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < M-1; i++) {
      diff[i] = X[i+1] - X[i];
      map.put(diff[i], map.getOrDefault(diff[i],0)+1);
    }

    Arrays.sort(diff);

    for (int i = diff.length-1; i >= 0 && i > diff.length-N; i--) {
      map.put(diff[i], map.get(diff[i])-1);
    }
    
    int ans = 0;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      ans += (entry.getKey()*entry.getValue());
    }

    System.out.println(ans);
  }
}