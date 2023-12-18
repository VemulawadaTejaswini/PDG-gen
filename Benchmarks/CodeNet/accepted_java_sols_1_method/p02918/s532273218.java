import java.util.Scanner;
public class Main {
  static Scanner scan=new Scanner(System.in);
  public static void main(String[] args) {
    int N = scan.nextInt();
    int K = scan.nextInt();
    String S = scan.next();

    int cnt = 0;
    for (int i = 0; i < N-1; i++) {
      if (S.charAt(i) != S.charAt(i+1)) {
        ++cnt;
      }
    }

    int ans = N-1 - Math.max(cnt - 2*K, 0);
    System.out.println(ans);
  }
}
