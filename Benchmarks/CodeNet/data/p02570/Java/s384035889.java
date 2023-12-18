import java.util.Scanner;

public class Main() {
  public static void main() {
    Scanner scanner = new Scanner(System.in);
    private int d = scanner.nextInt();
    private int t = scanner.nextInt();
    private int s = scanner.nextInt();
    if (t * s >= d)
      return "Yes";
    else
      return "No";
  }
}