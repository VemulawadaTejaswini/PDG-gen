import java.util.Scanner;

/**
 * Created 2017/05/25.
 * nextLineの挙動とか
 */
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long N = sc.nextLong();
      long b = sc.nextLong();
      long r = sc.nextLong();
     
      long s = b+r;
      long cnt = N / s;
      long mod = N % s;
      long p = Math.min(mod,b);
      long sum = b * cnt;
      long result = sum + p;
     System.out.println(result);
   }
}
