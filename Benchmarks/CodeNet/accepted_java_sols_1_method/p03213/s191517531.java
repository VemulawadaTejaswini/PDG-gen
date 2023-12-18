import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    if(n > 9) {
    ArrayList<Integer> prime = new ArrayList<Integer>();
    boolean[] is_prime = new boolean[n + 1];
    for(int i = 0; i <= n - 2; i++) is_prime[i] = true;
    is_prime[0] = false;
    if(n > 2) is_prime[1] = false;
    for(int i = 2; i <= n; i++) {
      if(is_prime[i]) {
        prime.add(i);
        for(int j = 2 * i; j <= n; j += i) is_prime[j] = false;
      }
    }
    int[] ord = new int[prime.size()];
    int[] m = new int[5];
    for(int i = 0; i < prime.size(); i++) {
      int p = prime.get(i);
      int t = 0;
      for(int j = 1; j <= 7; j++) {
        t += n / (int)Math.pow(p, j);
      }
      ord[i] = t;
      if(t >= 74) {
        m[0]++;
        m[1]++;
        m[2]++;
        m[3]++;
        m[4]++;
      } else if(t >= 24) {
        m[0]++;
        m[1]++;
        m[2]++;
        m[3]++;
      } else if(t >= 14) {
        m[0]++;
        m[1]++;
        m[2]++;
      } else if(t >= 4) {
        m[0]++;
        m[1]++;
      } else if(t >= 2) {
        m[0]++;
      }
    }
    ans += m[4];
    ans += (m[2] * (m[1] - 1));
    ans += (m[3] * (m[0] - 1));
    ans += (m[1] * (m[1] - 1) * (m[0] - 2) / 2);
    }
    System.out.println(ans);
  }
}