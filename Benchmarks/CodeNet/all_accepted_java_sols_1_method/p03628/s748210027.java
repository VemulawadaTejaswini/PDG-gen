import java.util.*;
public class Main {

  public static void main(String[] args) { 
      int mod = 1000000007;
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = sc.next();
      List<Integer> arr = new ArrayList<>();
      for(int i = 0; i < s.length(); i++) {
        if(i == s.length() - 1)
          arr.add(1);
        else {
          if(s.charAt(i) == s.charAt(i+1)) {
            arr.add(2);
            i++;
          } else 
            arr.add(1);
        }
      }
      long cnt = arr.get(0) == 1 ? 3 : 6;
      for(int i = 1; i < arr.size(); i++) {
        int curCnt = 0;
        if(arr.get(i-1) == 1) {
          curCnt = 2;
        } else if(arr.get(i) == 1) {
          curCnt = 1;
        } else
          curCnt = 3;
        cnt = cnt * curCnt % mod;
      }
      System.out.println(cnt);
  }
}