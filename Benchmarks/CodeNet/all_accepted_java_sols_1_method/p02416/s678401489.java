import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String numbers = "1";
    int sum;

    while(true) {
      numbers = scanner.nextLine();
      if (numbers.equals("0")) break;
      
      sum = 0;
      for (int i = 0; i < numbers.length(); ++i) {
        sum += Character.getNumericValue(numbers.charAt(i));
      }
      System.out.println(sum);
    }
  }
}
