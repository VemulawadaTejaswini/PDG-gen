import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double N = sc.nextDouble();
    long ans = 0;
    for (int i=1; i<=N; i++) {
      if (i%3 != 0 && i%5 != 0)
        ans += i;
    }
    
    
    System.out.println(ans);
  }
}  