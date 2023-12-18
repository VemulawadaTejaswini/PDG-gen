import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    switch(input) {
      case "A":
        System.out.println("T");
        break;
      case "C":
        System.out.println("G");
        break;
      case "T":
        System.out.println("A");
        break;
      case "G":
        System.out.println("C");
        break;
      default:
        System.out.println("Please input only A/C/T/G");
        break;
    }
  }
}