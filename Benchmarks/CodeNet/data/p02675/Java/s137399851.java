import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      String s = String.format("%03s",sc.next());
      switch (s.substring(2, 3)) {
      case "2":
      case "4":
      case "5":
      case "7":
      case "9":
        System.out.println("hon");
        break;
      case "0":
      case "1":
      case "6":
      case "8":
        System.out.println("pon");
        break;
      default:
        System.out.println("bon");
        break;
      }
    }
  }
}