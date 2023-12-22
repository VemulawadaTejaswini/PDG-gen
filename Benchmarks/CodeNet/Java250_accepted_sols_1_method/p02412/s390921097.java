import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      int n = sc.nextInt();
      int x = sc.nextInt();
      int ans = 0;
      if (n == 0 && x == 0) break;
      for (int i = 1; i < n+1; i++) {
        for (int j = i+1; j < n+1; j++) {
          for (int k = j+1; k < n+1; k++) {
            if (i+j+k == x) ans++;
          }
        }
      }
      System.out.println(ans);
    }
  }
}

