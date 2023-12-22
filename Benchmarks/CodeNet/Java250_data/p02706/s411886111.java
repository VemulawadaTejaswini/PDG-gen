import java.util.*;


public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.next());
      int m = Integer.parseInt(sc.next());
      int sum = 0;
      int[] ary = new int[m];
      for (int i = 0; i < ary.length; i++) {
        ary[i] = Integer.parseInt(sc.next());
        sum += ary[i];
      }
      
      if (sum > n) {
        System.out.println(-1);
      } else {
        System.out.println(n - sum);
      }
    }
}