import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String a = scanner.next();
    for (int i = a.length() - 1; i >= 0; i--) {
      System.out.print(a.charAt(i));
    }
    System.out.println();
  }
}

