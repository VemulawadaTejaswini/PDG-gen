
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] ans = new int[n];
    for(int i = 1; i < n; i++) { 
      int a = sc.nextInt() - 1;
      ans[a]++;
    }
    for(int i = 0; i < n; i++) {
      System.out.println(ans[i]);
    }
  }
}
