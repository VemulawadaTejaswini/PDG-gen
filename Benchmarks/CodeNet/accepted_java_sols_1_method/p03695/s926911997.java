import java.util.*;
public class Main{

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] types = new int[9];
      int maxCnt = 0;
      for(int i = 0; i < n; i++) {
        int score = sc.nextInt();
        int idx = Math.min(score/400, 8);
        types[idx]++;
      }
      int min = 0;
      int max = 0;
      for(int i = 0; i < types.length - 1; i++) {
        if(types[i] > 0) {
          max++;
          min++;
        }
      }
      max += types[8];
      if(min == 0) min = 1;
      System.out.println(min + " " + max);
  }
}
