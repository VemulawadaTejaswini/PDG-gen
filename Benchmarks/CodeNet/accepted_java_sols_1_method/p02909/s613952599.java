import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String str = scanner.next();
      if (str.equals("Sunny")) System.out.println("Cloudy");
      else if (str.equals("Cloudy")) System.out.println("Rainy");
      else if (str.equals("Rainy")) System.out.println("Sunny");
    }
}
