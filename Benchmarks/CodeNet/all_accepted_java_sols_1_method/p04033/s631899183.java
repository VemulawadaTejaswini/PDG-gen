import java.util.Scanner;

public class Main {
  private static final String POSITIVE = "Positive";
  private static final String NEGATIVE = "Negative";
  private static final String ZERO     = "Zero";
  public static void main(String[] args) {
    int result = 1;
    Scanner scanner = new Scanner(System.in);
    while(scanner.hasNextLine()) {
      String line = scanner.nextLine();
      String[] values = line.split(" ");
      
      int a = Integer.parseInt(values[0]);
      int b = Integer.parseInt(values[1]);
      
      if(a > 0) {
        System.out.println(POSITIVE);
      } else if (b > 0) {
        System.out.println(ZERO);
      } else {
        int subtract = Math.abs(a - b);
        if(subtract % 2 == 0) {
          System.out.println(NEGATIVE);
        } else {
          System.out.println(POSITIVE);
        }
      }
      return;
    }
  }
  
}