import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      Map<Integer, Integer> cntMap = new HashMap<>();
      for(int i = 1; i <= n; i++)
        cntMap.put(i, 0);
      for(int i = 2; i <= n; i++) {
        int num = sc.nextInt();
        cntMap.put(num, cntMap.get(num) + 1);
      }
      for(int i = 1; i <= n; i++)
      System.out.println(cntMap.get(i));
  }
}