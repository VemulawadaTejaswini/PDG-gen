import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    
    int ecount = 0;
    for (int i = 0; i < N; i++) {
      if (S.charAt(i) == 'E') {
        ecount++;
      }
    }
    
    int wcount = 0;
    int ans = Integer.MAX_VALUE;
    for (int i = 0; i < N; i++) {
      int count = 0;
      if (S.charAt(i) == 'W') {
        wcount++;
        count--;
      } else {
        ecount--;
      }
      count += wcount + ecount;
      ans = Math.min(count, ans);
    }
    
    System.out.println(ans);
  }
}