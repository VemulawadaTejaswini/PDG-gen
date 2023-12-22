import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
    int n = sc.nextInt();
    int m = sc.nextInt();
    ArrayList[] list = new ArrayList[m + 1];
    for(int i = 0; i < m + 1; i++) {
      list[i] = new ArrayList<Integer>();
    }
    for(int i = 0; i < n; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      if(a < (m + 1)) list[a].add(b);
    }
    int ans = 0;
    for(int i = 1; i <= m; i++) {
      for(int j = 0; j < list[i].size(); j++) {
        pq.add((int)(list[i].get(j))); 
      }
      if(pq.size() > 0) ans += pq.poll();
    }
    System.out.println(ans);
  }
}
