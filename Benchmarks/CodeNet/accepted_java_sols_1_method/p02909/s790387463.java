import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    String s = stdIn.next();

    switch(s) {
      case "Sunny" :
      System.out.println("Cloudy");
      break;
      case "Cloudy" :
      System.out.println("Rainy");
      break;
      case "Rainy" :
      System.out.println("Sunny");
      break;
    }
  }
}
