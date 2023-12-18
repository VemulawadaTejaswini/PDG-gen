import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long X = sc.nextLong();
    long Y = sc.nextLong();
    
    int ans = 0;
    long A = X;
    while (A <= Y) {
      A *= 2;
      ans++;
    }
     
    System.out.println(ans);
  }
}