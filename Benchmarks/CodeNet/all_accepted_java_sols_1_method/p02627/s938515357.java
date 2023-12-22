import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);

    final char c = scanner.next().charAt(0);
    System.out.println(Character.isUpperCase(c) ? 'A' : 'a');
  }
}
