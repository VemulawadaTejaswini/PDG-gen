import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    ArrayList[] list = new ArrayList[n];
    for(int i = 0; i < n; i++) {
      list[i] = new ArrayList<Integer>();
    }
    for(int i = 0; i < m; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      list[a].add(b);
      list[b].add(a);
    }
    int[] ans = new int[n];
    for(int i = 0; i < n; i++) {
      ans[i] = -1;
    }
    LinkedList<Integer> que = new LinkedList<Integer>();
    que.add(0);
    while(que.size() > 0) {
      int v = que.poll();
      ArrayList<Integer> e = list[v];
      for(int i = 0; i < e.size(); i++) {
        int c = e.get(i);
        if((ans[c] == -1) && (c > 0)) {
          ans[c] = v;
          que.add(c);
        }
      }
    }
    System.out.println("Yes");
    for(int i = 1; i < n; i++) {
      System.out.println(ans[i] + 1);
    }
  }
}