import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      List<List<Integer>> list = new ArrayList<>();
      for(int i = 0; i < m; i++) {
        int k = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for(int j = 0; j < k; j++)
          l.add(sc.nextInt() - 1);
        list.add(l);
      }
      int[] pArr = new int[m];
      for(int i = 0; i < m; i++)
        pArr[i] = sc.nextInt();

      int cnt = 0;
      loop:
      for(int i = 0; i < (1 << n); i++) {
        for(int bulb = 0; bulb < m; bulb++) {
          int onCnt = 0;
          for(int stch : list.get(bulb)) {
            if(((i >> stch) & 1) == 1)
              onCnt++;
          }
          if(onCnt % 2 != pArr[bulb])
            continue loop;
        }
        cnt++;
      }
      System.out.println(cnt);
  }
}