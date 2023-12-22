import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = Long.parseLong(sc.next());
    long b = Long.parseLong(sc.next());
    long c = Long.parseLong(sc.next());
    long d = Long.parseLong(sc.next());
	long ans;
    
    if (c > d) {
      long tmp = c;
      c = d;
      d = tmp;
    }
	long ndivc = b/c - a/c;
    if(a%c == 0) ndivc++;
    long ndivd = b/d - a/d;
    if(a%d == 0) ndivd++;
    long lcm = c * d / gcd(c, d);
    long ndivlcm = b/lcm - a/lcm;
    if(a%lcm == 0) ndivlcm++;
    
    ans = b - a + 1 - ndivc - ndivd + ndivlcm;
    
    System.out.println(ans);
    
  }
  
  public static long gcd(long a, long b) {
    if (b == 0) {
      return a;
    } else {
      return gcd(b,a%b);
    }
  }
}
