import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      long[][] cood = new long[n][2];
      for(int i = 0; i < n; i++) {
        cood[i][0] = sc.nextInt();
        cood[i][1] = sc.nextInt();
      }

      long maxArea = Long.MAX_VALUE;
      int cnt = 0;

      for(long[] a : cood) {
        for(long[] b : cood) {
          for(long[] c : cood) {
            for(long[] d: cood) {
              cnt = 0;
              long leftX = Math.min(Math.min(a[0], b[0]), Math.min(c[0], d[0])), 
                  rightX = Math.max(Math.max(a[0], b[0]), Math.max(c[0], d[0]));
              long downY = Math.min(Math.min(a[1], b[1]), Math.min(c[1], d[1])), 
                  upY = Math.max(Math.max(a[1], b[1]), Math.max(c[1], d[1]));
              for(long[] p : cood) {
                if(leftX <= p[0] && p[0] <= rightX &&
                  downY <= p[1] && p[1] <= upY
                ) cnt++;
              }
             // System.out.println(rightX + "," + leftX + " - " + upY + "," + downY);
              if(cnt >= k) {
                  
                maxArea = Math.min(maxArea, (rightX - leftX) * (upY - downY));
              }
            }
          }
        }
      }
      System.out.println(maxArea);
  }
}