import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] c = new int[N];
    for (int i = 0; i < N; i++) {
      int A = sc.nextInt();
      
      c[A]++;
    }
    
    for (int i = N%2; i < N; i++) {
      if ((N%2 == 0 && i%2 == 0 && c[i] != 0)
         || (N%2 == 0 && i%2 == 1 && c[i] != 2)
         || (N%2 == 1 && i == 0 && c[i] != 1)
         || (N%2 == 1 && i%2 == 0 && c[i] != 2)
         || (N%2 == 1 && i%2 == 1 && c[i] != 0)) { {
          System.out.println(0);
          return;
        }
      }
    }
    int p = N/2;
    long ans = 1;
    while(p > 0) {
      ans = ans*2 % 1000000007;
      p--;
    }
    System.out.println(ans);
  }
}