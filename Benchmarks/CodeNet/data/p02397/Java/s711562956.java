import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PrintWriter pw = new PrintWriter(System.out);
    while (true) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      if (x == 0 && y == 0)  break;
      pw.append(x > y ? y + " " + x : x + " " + y);
      pw.append("\n");
    }
    pw.flush();
    pw.close();
    sc.close();
  }
}
