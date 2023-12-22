import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String tomorrow;
    switch (sc.next()) {
      case "Sunny":
        tomorrow = "Cloudy";
        break;
      case "Cloudy":
        tomorrow = "Rainy";
        break;
      case "Rainy":
      default:
        tomorrow = "Sunny";
        break;
    }

    System.out.println(tomorrow);
  }
}
