import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      List<int[]>[] arr = new List[n];
      for(int i = 0; i < n; i++) {
        int aNum = sc.nextInt();
        List<int[]> list = new ArrayList<>();
        for(int j = 0; j < aNum; j++) {
          list.add(new int[]{ sc.nextInt() - 1, sc.nextInt() });
        }
        arr[i] = list;
      }
      int maxCnt = 0;
      loop:
      for(int i = 0; i < (1 << n); i++) {
        int curCnt = 0;
        for(int j = 0; j < n; j++) {
          if(((i >> j) & 1) == 1) { // j番めの人がtrue
            curCnt++;
            for(int[] t : arr[j]) {
              if(((i >> t[0]) & 1) != t[1])
                continue loop;
            }
          }
        }
        maxCnt = Math.max(maxCnt, curCnt);
      }
      System.out.println(maxCnt);
  }
}