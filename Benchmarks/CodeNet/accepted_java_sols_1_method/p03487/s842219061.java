import java.util.*;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ans =0;
    int N = sc.nextInt();
    int[] count = new int[100001];
    Set<Integer> setA = new HashSet<Integer>();
    for (int i =1; i<=N; i++) {
      int a = sc.nextInt();
      if (a >= 100001) {
        ans ++;
        continue;
      }
      count[a]++;
      setA.add(a);
    }
    for (int i : setA) {
      if (count[i] > i ) {
        ans += count[i] - i;
      } else if (count[i] < i) {
        ans += count[i];
      }
    }
    System.out.println(ans);
  }
}