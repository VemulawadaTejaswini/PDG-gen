import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] pos = new int[m];
      for(int i = 0; i < m; i++)
        pos[i] = sc.nextInt();
      Arrays.sort(pos);
      ArrayList<int[]> dist = new ArrayList<>();
      for(int i = 1; i < pos.length; i++) {
        dist.add(new int[]{pos[i-1], pos[i]});
      }
      Collections.sort(dist, (d1, d2) -> (d2[1] - d2[0]) - (d1[1] - d1[0]));
      ArrayList<int[]> intervals = new ArrayList<>();
      for(int i = 0; i < n - 1&& i < dist.size(); i++) {
        intervals.add(dist.get(i));
      }
      Collections.sort(intervals, (itv1, itv2) -> itv1[0] - itv2[0]);
      int cnt = 0;
      int start = pos[0];

      for(int i = 0; i < intervals.size(); i++) {
        int[] itv = intervals.get(i);
        cnt += itv[0] - start;
        start = itv[1];
      }
      
      cnt += pos[pos.length - 1] - start;
      System.out.println(cnt);
  }
}