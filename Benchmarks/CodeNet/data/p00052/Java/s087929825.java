import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    while (scanner.hasNext()) {
      int n = scanner.nextInt();
      if (n == 0) {
        break;
      }
      int work = (n / 25) / 4 - 1;
      if (work < 0) {
        work = 0;
      }
      out += n / 5 + n / 25 + work + "\n";
    }
    System.out.print(out);
  }
}