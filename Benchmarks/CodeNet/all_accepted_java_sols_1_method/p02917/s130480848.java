import java.util.Scanner;
public class Main {
  static Scanner scan=new Scanner(System.in);
  public static void main(String[] args) {
    int n = scan.nextInt();

    int[] b = new int[n+1];
    for (int i = 1; i < n; ++i) {
      b[i] = scan.nextInt();
    }
    b[0] = b[n] = 100000000;

    int ans = 0;
    for (int i = 0; i < n; ++i) {
      ans += Math.min(b[i], b[i+1]);
    }

    System.out.println(ans);
  }
}
