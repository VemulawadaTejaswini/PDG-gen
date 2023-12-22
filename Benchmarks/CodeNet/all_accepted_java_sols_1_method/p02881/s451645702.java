import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    long n = sc.nextLong();
    
    long ans = 9223372036854775807L;
    
    for(long i = 1; i <= Math.sqrt(n); i++) {
      if(n%i==0) {
        long a = i + (n/i) -2;
        if(a < ans) {
          ans = a;
        }
      }
    }
    
    System.out.println(ans);
  }
}