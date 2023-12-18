import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] prime = new int[1000001];
    prime[1] = 1;
    for(int i = 2; i <= 1000000; i++) {
      if(prime[i] == 0) {
        for(int j = i; j <= 1000000; j += i) {
          prime[j] = i;
        }
      }
    }
    int g = 1;
    int[] prime2 = new int[1000001];
    for(int i = 0; i < n; i++) {
      int a = sc.nextInt();
      if(i == 0) {
        g = a;
      } else {
        g = gcd(g, a);
      }
      HashSet<Integer> set = new HashSet<Integer>();
      while(a > 1) { 
        set.add(prime[a]);
        a /= prime[a];
      }
      for(Integer e : set){
        prime2[e]++;
      }
    }
    String ans = "not coprime";
    if(g == 1) ans = "setwise coprime";
    int p = 0;
    for(int i = 0; i <= 1000000; i++) {
      if(prime2[i] > 1) p++;
    }
    if(p == 0) ans = "pairwise coprime"; 
    System.out.println(ans);
  }

  public static int gcd(int x, int y) {
    if(y == 0) return x;
    return gcd(y, (x % y));
  }
}