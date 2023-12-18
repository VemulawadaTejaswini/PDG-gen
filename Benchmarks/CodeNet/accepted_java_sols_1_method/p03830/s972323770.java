import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long MOD = (long)Math.pow(10, 9) + 7;
    long n = sc.nextLong();
    boolean[] is_p = new boolean[(int)(n + 1)];
    for(int i = 2; i <= (int)n; i++) {
      is_p[i] = true;
    }
    ArrayList<Long> p = new ArrayList<Long>();
    for(int i = 2; i <= (int)n; i++) {
      if(is_p[i]) {
        p.add((long)i);
        for(int j = (2 * i); j <= (int)n; j += i) {
          is_p[j] = false;
        }
      }
    }
    long ans = 1;
  //  ArrayList<Long> q = new ArrayList<Long>();
    for(int i = 0; i < p.size(); i++) {
      long P = p.get(i);
      long t = 0;
      for(int j = 1; j <= 10; j++) {
        long s = n / ((long)Math.pow(P, j));
        t += s;
      }
      ans = (ans * (t + 1)) % MOD;
    }
    System.out.println(ans);
  }
}