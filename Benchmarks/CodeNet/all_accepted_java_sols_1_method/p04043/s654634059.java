import java.util.Scanner;

public class Main {
  private static final int IROHA = 17;
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      String input = scan.nextLine();
      String[] arr = input.split("\\s");
      String result = "YES";
      try {
        int sum = 0;
        for (String s: arr) {
          if (s.matches("^[57]$")) {
            sum += Integer.parseInt(s);
          } else {
            result = "NO";
          }
        }
        if (sum != IROHA) {
          result = "NO";
        }
      } catch (NumberFormatException e) {
        result = "NO";
        throw e;
      }
      System.out.println(result);
        
    }
  }
}