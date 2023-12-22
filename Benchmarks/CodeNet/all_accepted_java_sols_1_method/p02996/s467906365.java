import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[][] seg = new int[n][2];
      for(int i = 0; i < n; i++) {
        seg[i][0] = sc.nextInt();
        seg[i][1] = sc.nextInt();
      }
      Arrays.sort(seg, (s1, s2) -> s1[1] - s2[1]);
      int time = 0;
      for(int i = 0; i < n; i++) {
        int t = seg[i][0];
        int l = seg[i][1];
        if(time + t > l) {
          System.out.println("No");
          return;
        }
        time += t;
      }
      System.out.println("Yes");
  }
}