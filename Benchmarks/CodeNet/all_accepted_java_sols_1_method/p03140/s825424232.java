import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String a = sc.next();
    String b = sc.next();
    String c = sc.next();
    int ans = 0;

    for (int i = 0; i < n; i++) {
      if (!((a.charAt(i) == b.charAt(i)) && (b.charAt(i) == c.charAt(i)))) {
        if ((a.charAt(i) != b.charAt(i)) && (b.charAt(i) != c.charAt(i)) && (c.charAt(i) != a.charAt(i))) {
          ans += 2;
        } else {
          ans++;
        }
      }
    }

    System.out.println(ans);

  }
}