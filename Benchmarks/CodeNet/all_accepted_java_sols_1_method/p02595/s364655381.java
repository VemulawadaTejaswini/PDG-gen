import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long D = sc.nextLong();
    long X = 0;
    long Y = 0;
    int ans = 0;
    
    for(int i = 0; i < N; ++i) {
      X = sc.nextLong();
      Y = sc.nextLong();
      if((X * X + Y * Y) <= D * D) {
          ++ans;
      }
    }
    System.out.println(ans);
  }
}