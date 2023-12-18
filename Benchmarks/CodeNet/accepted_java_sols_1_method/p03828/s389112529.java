import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<Integer>();
    long MOD = (long)Math.pow(10, 9) + 7;
    for(int i = 2; i <= n; i++) {
      int p = 0;
      for(int j = 2; (j * j) <= i; j++) {
        if((i % j) == 0) p++;  
      }
      if(p == 0) list.add(i);
    }
    long ans = 1;
    for(int i = 0; i < list.size(); i++) {
      int g = list.get(i);
      int t = 0;
      int m = n;
      while(m > 0) {
        t += (m / g);
        m /= g;
      }
      ans = (ans * (long)(t + 1)) % MOD;
    }
    System.out.println(ans);
  }
}
