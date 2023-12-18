import java.io.PrintWriter;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PrintWriter pw = new PrintWriter(System.out);

    while (true) {
        int n = sc.nextInt();

        if (n == 0) break;

        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }

        double avg = IntStream.of(s).average().getAsDouble();
        double total = IntStream.of(s).mapToDouble(i -> Math.pow(i - avg, 2)).sum();
        double a = Math.sqrt(total / n);

        pw.println(a);
    }

    pw.flush();
  }
}
