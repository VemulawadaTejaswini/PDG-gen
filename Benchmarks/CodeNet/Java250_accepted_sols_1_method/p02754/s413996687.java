import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      long a = sc.nextLong();
      long b = sc.nextLong();

      long cnt = n / (a + b) * a;
      n %= (a + b);
      cnt += Math.min(a, n);
      System.out.println(cnt);
  }
}