import java.util.*;


public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.next());
      int d = Integer.parseInt(sc.next());
      int ans = 0;
      int sum = 0;
      for (int i =0; sum < n; i++) {
        sum += d * 2 + 1;
        ans += 1;
      }
      System.out.println(ans);
    }
}