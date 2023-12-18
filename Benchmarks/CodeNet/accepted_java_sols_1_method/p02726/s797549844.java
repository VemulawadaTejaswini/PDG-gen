import java.util.*;
import java.io.BufferedInputStream;
 
public class Main {
  private static int[] count;
  private static int n, x, y;
  public static void main(String[] args){
    Scanner sc = new Scanner (new BufferedInputStream(System.in));
    n = sc.nextInt();
    x = sc.nextInt();
    y = sc.nextInt();
    int[] res = new int[n];
    for(int i = 1; i <= n; ++i) {
      count = new int[n + 1];
      Arrays.fill(count, Integer.MAX_VALUE);
      LinkedList<Integer> que = new LinkedList<>();
      que.offer(i);
      count[i] = 0;
      int d = 0;
      while(!que.isEmpty()) {
        int now = que.poll();
        if(now > 1 && count[now - 1] == Integer.MAX_VALUE) {
          que.offer(now - 1);
          count[now - 1] = count[now] + 1;
        }
        if(now < n && count[now + 1] == Integer.MAX_VALUE) {
          que.offer(now + 1);
          count[now + 1] = count[now] + 1;
        }
        if(now == x && count[y] == Integer.MAX_VALUE) {
          que.offer(y);
          count[y] = count[x] + 1;
        }
        if(now == y && count[x] == Integer.MAX_VALUE) {
          que.offer(x);
          count[x] = count[y] + 1;
        }
      }
      for(int j = 1; j <=n; ++j) {
        res[count[j]]++;
      }
    }
    for(int i = 1; i < n; ++i) {
      System.out.println(res[i] / 2);
    }
  }
}
