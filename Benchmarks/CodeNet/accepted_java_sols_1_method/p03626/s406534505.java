import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int N = Integer.parseInt(sc.next());
    String String1 = sc.next();
    String Strong2 = sc.next();
    
    if (N == 1) {
      System.out.println(3);
      return;
    }
    
    char s1[] = new char[N];
    char s2[] = new char[N];
    for (int i = 0; i < N; i++) {
      s1[i] = String1.charAt(i);
      s2[i] = Strong2.charAt(i);
    }
    final long mod = 1000000007;
    
    long ans;
    boolean flag, prev;
    int i = 0;
    if (s1[0] == s2[0]) {
      prev = true;
      ans = 3;
      i += 1;
    } else {
      prev = false;
      ans = 3 * 2;
      i += 2;
    }
    while (i < N) {
      if (s1[i] == s2[i]) {
        flag = true;
        i += 1;
      } else {
        flag = false;
        i += 2;
      }
      
      if (prev && flag) {
        ans = ans * 2 % mod;
      } else if (prev && !flag) {
        ans = ans * 2 * 1 % mod;
      } else if (!prev && flag) {
      } else if (!prev && !flag) {
        ans = ans * 3 % mod;
      }
      
      prev = flag;
    }
    
    System.out.println(ans);
  }
}