import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      int minLen = Integer.MAX_VALUE;
      for(long i = 1; i * i <= n; i++) {
        if(n % i == 0)
          minLen = Math.min(minLen, calDigit(Math.max(i, n / i)));
      }
      System.out.println(minLen);
  }

  private static int calDigit(long n) {
    int cnt = 0;
    while(n > 0) {
      cnt++;
      n /= 10;
    }
    return cnt;
  }
}