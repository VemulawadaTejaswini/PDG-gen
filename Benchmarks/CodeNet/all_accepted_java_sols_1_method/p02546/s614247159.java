import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final String word = scanner.next();

    System.out.println(word.endsWith("s") ? word + "es" : word + "s");
  }
}