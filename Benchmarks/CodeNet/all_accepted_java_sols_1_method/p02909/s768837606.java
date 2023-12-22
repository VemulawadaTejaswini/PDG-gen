import java.util.Scanner;
//import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String tenki = sc.nextLine();
    if (tenki.equals("Sunny")) {
      System.out.println("Cloudy");
    } else if (tenki.equals("Cloudy")) {
      System.out.println("Rainy");
    } else if (tenki.equals("Rainy")) {
      System.out.println("Sunny");
    }
  }
}