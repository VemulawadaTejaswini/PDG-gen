import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] cntArr = new int[n+1];
      boolean[] hasBall = new boolean[n+1];
      Arrays.fill(cntArr, 1);
      hasBall[1] = true;

      for(int i = 0; i < m; i++) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(hasBall[x]) {
          hasBall[y] = true;
          if(cntArr[x] == 1)
            hasBall[x] = false;
        }
        cntArr[x]--;
        cntArr[y]++;
      }
      int cnt = 0;
      for(int i = 1; i <= n; i++)
        if(hasBall[i])
          cnt++;
      System.out.println(cnt);
  }
}