import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int N = Integer.parseInt(sc.next());
    int C = Integer.parseInt(sc.next());
    
    int s[] = new int[N];
    int t[] = new int[N];
    int c[] = new int[N];
    
    for (int i = 0; i < N; i++) {
      s[i] = Integer.parseInt(sc.next());
      t[i] = Integer.parseInt(sc.next());
      c[i] = Integer.parseInt(sc.next());
    }
    
    final int maxTime = 100000;
    byte table[][] = new byte[C][maxTime * 2 + 2];
    for (int i = 0; i < N; i++) {
      for (int j = s[i]; j <= t[i]; j++) {
        table[c[i] - 1][j] = 1;
      }
    }
    int ans = 0, count = 0;
    for (int i = 0; i < maxTime; i++) {
      count = 0;
      for (int j = 0; j < C; j++) {
        count += table[j][i];
      }
      if (ans < count) {
        ans = count;
      }
    }
    System.out.println(ans);
  }
}