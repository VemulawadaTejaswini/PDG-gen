import java.util.*;
import java.math.*;

public class Main{
  public static long m_pow(long a, long n) {
    long ans = 1;
    while(n >= 1) {
      if((n & 1) == 1) {
        ans = ans * a;
      }
      a = a * a;
      n >>= 1;
    }
    return ans;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long H = sc.nextLong();
   	double cmp = Math.log(H) / Math.log(2);
    int count = (int) cmp;
    System.out.println(m_pow(2, count + 1) - 1);
  }
}