import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long A = sc.nextLong();
    long B = sc.nextLong();
    sc.close();
    
    long d = N / (A + B);
    long r = N % (A + B);
    
    long ans = (d * A) + Math.min(r, A);
    System.out.println(ans);
  }
}