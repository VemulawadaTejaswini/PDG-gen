import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);

    final String s = scanner.nextLine();

    StringBuilder o = new StringBuilder();
    for (char c: s.toCharArray()) {
      switch (c) {
        case '0':
        case '1':
          o.append(c);
          break;
        case 'B':
          if (o.length() > 0) {
            o.deleteCharAt(o.length() - 1);
          }
      }
    }

    System.out.println(o.toString());
  }
}