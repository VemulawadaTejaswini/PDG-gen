import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      long k = sc.nextLong();
      long res = n % k;
      res = Math.min(res, k - res);
      System.out.println(res);
  }
}