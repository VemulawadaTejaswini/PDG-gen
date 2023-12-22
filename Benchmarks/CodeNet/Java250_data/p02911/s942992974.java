import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PrintWriter pw = new PrintWriter(System.out);

    int n = sc.nextInt();
    long k = sc.nextLong();

    long[] p = new long[n];
    for (int i = 0; i < n; i++) {
        p[i] = k;
    }

    int q = sc.nextInt();
    for (int i = 0; i < q; i++) {
        int a = sc.nextInt();
        p[a-1] += 1;
    }

    for (int i = 0; i < n; i++) {
        pw.println(p[i] - q > 0 ? "Yes" : "No");
    }

    pw.flush();
  }
}