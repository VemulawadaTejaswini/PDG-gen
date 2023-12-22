import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String c = sc.next();

    if (c.equals("Sunny")) {
      System.out.println("Cloudy");
    } else if (c.equals("Cloudy")) {
      System.out.println("Rainy");
    } else {
      System.out.println("Sunny");
    }
  }
}
