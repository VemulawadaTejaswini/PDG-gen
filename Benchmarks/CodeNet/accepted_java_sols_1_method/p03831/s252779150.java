import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long a = sc.nextLong();
    long b = sc.nextLong();
    long ima = sc.nextLong();
    long ans = 0;
    for(int i = 1; i < n; i++) {
      long x = sc.nextLong();
      long t = a * (x - ima);
      if(t > b) {
        ans += b;
      } else {
        ans += t;
      }
      ima = x;
    }
    System.out.println(ans);
  }
}