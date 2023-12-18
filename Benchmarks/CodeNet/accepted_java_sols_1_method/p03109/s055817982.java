import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine().trim();
    String[] fields = line.split("/");
    if (10000 * Integer.parseInt(fields[0]) + 100 * Integer.parseInt(fields[1]) + Integer.parseInt(fields[2]) <= 20190430) {
      System.out.println("Heisei");
    } else {
      System.out.println("TBD");
    }
  }
}
