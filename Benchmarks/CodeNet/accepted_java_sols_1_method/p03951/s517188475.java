import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    String t = sc.next();
    int ans = n;

    for (int i = 0; i < n; i++) {
      if (s.substring(i, n).equals(t.substring(0, n - i))) {
        break;
      } else {
        ans++;
      }
    }

    System.out.println(ans);

  }
}