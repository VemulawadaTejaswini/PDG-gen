import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int k = scan.nextInt();

    boolean[] res = new boolean[n];
    for (int i = 0; i < n; i++) {
      res[i] = false;
    }

    for (int i = 0; i < k; i++) {
      int d = scan.nextInt();
      for (int j = 0; j < d; j++) {
        int tmp = scan.nextInt();
        tmp--;
        if (res[tmp] == false) {
          res[tmp] = true;
        }
      }
    }

    int cnt = 0;

    for (int i = 0; i < n; i++) {
      if (res[i] == false) {
        cnt++;
      }
    }

    System.out.println(cnt);

  }

}