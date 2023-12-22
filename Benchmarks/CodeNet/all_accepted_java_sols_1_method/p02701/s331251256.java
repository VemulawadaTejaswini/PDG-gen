import java.util.*;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
      //整数の入力
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.next());
      
      //重複はSetでいい
      Set<String> numSet = new HashSet<>();
      for (int i=0; i<n; i++) {
          String di = sc.next();
          numSet.add(di);
      }
 
      System.out.println(numSet.size());
    }
}