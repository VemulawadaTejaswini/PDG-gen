import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    final String[] weather = {"Sunny", "Cloudy", "Rainy"};

    while (in.hasNext()) {
      String S = in.next();

      for (int i = 0; i < weather.length; ++i) {
        if (S.equals(weather[i])) {
          System.out.println(weather[(i + 1) % weather.length]);
        }
      }
    }
  }
}