import java.util.*;
public class Main{

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] types = new int[8];
      int maxCnt = 0;
      for(int i = 0; i < n; i++) {
        int score = sc.nextInt();
        if(1 <= score && score < 400) {
          types[0] = 1;
        } else if(400 <= score && score < 800) {
          types[1] = 1;
        } else if(800 <= score && score < 1200) {
          types[2] = 1;
        } else if(1200 <= score && score < 1600) {
          types[3] = 1;
        } else if(1600 <= score && score < 2000) {
          types[4] = 1;
        } else if(2000 <= score && score < 2400) {
          types[5] = 1;
        } else if(2400 <= score && score < 2800) {
          types[6] = 1;
        } else if(2800 <= score && score < 3200) {
          types[7] = 1;
        } else {
          maxCnt++;
        }
      }
      int min = 0;
      int max = 0;
      for(int i = 0; i < types.length; i++) {
        if(types[i] > 0) {
          max++;
          min++;
        }
      }
      if(min == 0 && maxCnt > 0)
        min = 1;
      System.out.println(min + " " + (max + maxCnt));
  }

}
