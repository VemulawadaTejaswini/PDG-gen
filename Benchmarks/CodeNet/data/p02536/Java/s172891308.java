import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    
    int[] ab = new int[n+1];
    
    for(int i = 0; i < m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      ab[a] = 1;
      ab[b] = 1;
    }
    int cnt = 0;
    for(int i = 1; i <= n; i++) {
      if(ab[i] == 0) cnt++;
    }
    System.out.println(cnt);
  }
}