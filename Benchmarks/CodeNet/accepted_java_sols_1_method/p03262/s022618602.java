import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int x = sc.nextInt();
      
      int[] pos = new int[n];
      for(int i = 0; i < n; i++)
        pos[i] = sc.nextInt();
      Arrays.sort(pos);
      
      int minItv = Integer.MAX_VALUE;
      for(int p : pos) {
          minItv = Math.min(minItv, Math.abs(x - p));
      }

      int[] intervals = new int[n-1];
      int min = Integer.MAX_VALUE;
      for(int i = 0; i < n-1; i++) {
        intervals[i] = pos[i+1] - pos[i];
        min = Math.min(min, intervals[i]);
      }
      
      Arrays.sort(intervals);
      while(minItv > 1) {
          boolean flag = true;
          for(int itv : intervals) {
            if(itv % minItv != 0) {
                flag = false;
                break;
            }
          }
          if(flag == true) {
              System.out.println(minItv);
              return;
          }
          minItv--;
      }
      
      System.out.println(1);
  }

}