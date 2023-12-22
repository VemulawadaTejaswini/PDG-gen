import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    String line = sc.nextLine();
    int[] titles = new int[line.length()];
    int firstIs0ColoringCount = 0;
    int firstIs1ColoringCount = 0;
    for (int i = 0; i < line.length(); i++) {
      int current = Integer.parseInt(String.valueOf(line.charAt(i)));
      if (current == i % 2) {
        firstIs1ColoringCount++;
      } else {
        firstIs0ColoringCount++;
      }
    }
    pw.println(Math.min(firstIs0ColoringCount, firstIs1ColoringCount));
  }
}
