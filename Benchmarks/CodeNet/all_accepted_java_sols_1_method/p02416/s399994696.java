import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while(true) {
      char[] number = in.next().toCharArray();
      if (number[0] == '0') break;
      int sum = 0;
      for (int i = 0; i < number.length; i++) {
        sum += Character.getNumericValue(number[i]);
      }
      System.out.println(sum);
    }
  }
}