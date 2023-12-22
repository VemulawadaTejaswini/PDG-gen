import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long ans = 0;
    long sum = 0;
    for(long i = 1; i <= x; i++) {
      sum += i;
      if(sum >= x) {
        ans = i;
        break;
      }
    }
    System.out.println(ans);
  }
}