import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PrintWriter pw = new PrintWriter(System.out);

    while (true) {
        String s = sc.next();

        if ("-".equals(s)) break;

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int h = sc.nextInt();
            s = s.substring(h) + s.substring(0, h);
        }

        pw.println(s);
    }

    pw.flush();
  }
}
