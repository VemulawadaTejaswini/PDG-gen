import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    while(true) {
      int n = sc.nextInt();
      int s = sc.nextInt();
      int cnt = 0;

      if(n == 0 && s == 0) {
        break;
      }

      for(int i = 1; i <= n; i++) {
        for(int j = i + 1; j <= n; j++) {
          for(int k = j + 1; k <= n; k++) {
            if(i + j + k == s) cnt++;
          }
        }
      }

      System.out.println(cnt);
    }
  }
}