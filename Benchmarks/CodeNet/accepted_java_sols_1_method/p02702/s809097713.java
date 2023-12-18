import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      String s = sc.next();

      Map<Integer, Integer> prefixCnt = new HashMap<>();
      prefixCnt.put(0, 1);
      int fac = 1; 
      int cur = 0;
      long res = 0;
      for(int i = s.length() - 1; i >= 0; i--) {
        cur = (cur + (s.charAt(i) - '0') * fac) % 2019;
        fac = (fac * 10) % 2019;
        if(prefixCnt.containsKey(cur)) {
          res += prefixCnt.get(cur);
          prefixCnt.put(cur, prefixCnt.get(cur) + 1);
        } else
          prefixCnt.put(cur, 1);
      }
      System.out.println(res);
  }
}