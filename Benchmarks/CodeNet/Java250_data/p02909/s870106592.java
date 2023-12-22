import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String s = scanner.next();
    switch (s) {
      case "Sunny":
        System.out.println("Cloudy");
        return;
      case "Cloudy":
        System.out.println("Rainy");
        return;
      case "Rainy":
        System.out.println("Sunny");
    }
  }
}
