import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] s = new int[M];
    int[] c = new int[M];

    for (int i = 0; i < M; i++) {
      s[i] = sc.nextInt();
      c[i] = sc.nextInt();
    }

    int begin = (int)Math.pow(10, N - 1);
    if (begin == 1) begin = 0;
    int end = (int)Math.pow(10, N);

    for (int n = begin; n < end; n++) {
      String str = String.valueOf(n);
      boolean f = true;
      for (int i = 0; i < M; i++) {
        if (Integer.parseInt(str.substring(s[i] - 1, s[i])) != c[i]) {
          f = false;
          break;
        }
      }
      if (f) {
        System.out.println(str);
        return;
      }
    }

    System.out.println("-1");

    sc.close();
  }
}