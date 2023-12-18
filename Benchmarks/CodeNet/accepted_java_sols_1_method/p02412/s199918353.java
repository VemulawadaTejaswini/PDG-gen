import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdInt = new Scanner(System.in);

  int l = 0;
  int[] ansans = new int[10000];
    while (true) {
      int n, x, ans = 0;

      n = stdInt.nextInt();
      x = stdInt.nextInt();
      if (n == 0 && x == 0) break;

      for (int i = n; i > 0; i--) {
        for (int j = i-1; j > 0; j--) {
          for (int k = j-1; k > 0; k--) {
            if (i + j + k == x) 
            ans++;
          }
        }
      }
      ansans[l++] = ans;
    }

    for (int i = 0; i < l; i++) {
      System.out.println(ansans[i]);
    }
  }
}
