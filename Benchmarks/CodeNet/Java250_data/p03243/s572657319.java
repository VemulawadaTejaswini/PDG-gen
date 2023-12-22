import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int ones = N % 10;
      int tens = (N / 10) % 10;
      int hundreds = (N / 100) % 10;
      
      if (tens > hundreds) {
        ++hundreds;
      } else if (tens == hundreds && ones > tens) {
        ++hundreds;
      }

      System.out.println(hundreds * 100 + hundreds * 10 + hundreds);
    }
  }
}