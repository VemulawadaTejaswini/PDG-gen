import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char c = scanner.next().charAt(0);
    switch (c) {
      case 'a':
      case 'i':
      case 'u':
      case 'e':
      case 'o':
        System.out.println("vowel");
        break;
      default:
        System.out.println("consonant");
    }
  }
}
