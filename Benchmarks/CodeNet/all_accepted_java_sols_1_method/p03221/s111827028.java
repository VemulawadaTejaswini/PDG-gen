import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    ArrayList[] year = new ArrayList[n];
    for(int i = 0; i < n; i++) {
      year[i] = new ArrayList<Integer>();
    }
    int[] p = new int[m];
    int[] y = new int[m];
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for(int i = 0; i < m; i++) {
      p[i] = sc.nextInt() - 1;
      y[i] = sc.nextInt();
      year[p[i]].add(y[i]);
    }
    for(int i = 0; i < n; i++) {
      Collections.sort(year[i]);
      for(int j = 0; j < year[i].size(); j++) {
        map.put((int)year[i].get(j), j + 1);
      }
    }
    for(int i = 0; i < m; i++) {
      p[i]++;
      String s1 = String.valueOf(p[i]);
      String ans1 = s1;
      for(int j = 0; j < 6 - s1.length(); j++) {
        ans1 = "0" + ans1;
      }
      int t2 = map.get(y[i]);
      String s2 = String.valueOf(t2);
      String ans2 = s2;
      for(int j = 0; j < 6 - s2.length(); j++) {
        ans2 = "0" + ans2;
      }
      System.out.println(ans1 + ans2);
    }
  }
}
