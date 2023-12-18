import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true) {
      int cnt = 0;
      int n = sc.nextInt();
      int x = sc.nextInt();
      if (n == 0 && x == 0) break;
      for (int i = 1; i <= n - 2; i++) {
        if (i >= x) break;
        for (int j = i + 1; j <= n - 1; j++) {
          if (i + j >= x) break;
          for (int k = j + 1; k <= n; k++) {
            if (i + j + k == x) cnt++;
            if (i + j + k >= x) break;
          }
        }
      }
      System.out.println(cnt);
    }
  }
}

