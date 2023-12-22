
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    var sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int N = sc.nextInt();
    String S = sc.next();

    long r = 0, g = 0, b = 0, eq = 0;
    for (int i = 0; i < N; i++) {
      switch (S.charAt(i)) {
        case 'R':
          r++;
          break;
        case 'G':
          g++;
          break;
        case 'B':
          b++;
          break;
      }
    }
    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        int k = 2 * j - i; // j - i == k - j
        if (k >= N) continue;
        char ci = S.charAt(i);
        char cj = S.charAt(j);
        char ck = S.charAt(k);
        if (j - i == k - j && ci != cj && cj != ck && ck != ci) {
          eq++;
        }
      }
    }

    System.out.println(r * g * b - eq);
  }
}
