import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int r = sc.nextInt();
    int s = sc.nextInt();
    int p = sc.nextInt();
    String T = sc.next();

    char[] t = T.toCharArray();
    int sum = 0;

    for (int i = k; i < n; i++) {
      if (t[i-k] == t[i]) {
        t[i] = '/';
      }
    }

    for (int i = 0; i < n; i++) {
      if (t[i] == 'r') {
        sum += p;
      } else if (t[i] == 's') {
        sum += r;
      } else if (t[i] == 'p') {
        sum += s;
      }
    }

    System.out.println(sum);

  }

}
