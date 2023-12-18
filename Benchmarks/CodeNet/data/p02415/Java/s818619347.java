import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();

    char[] ch = str.toCharArray();

    for (int i = 0; i < str.length(); ++i) {
      if (Character.isLowerCase(ch[i])) ch[i] -= 32;
      else if (Character.isUpperCase(ch[i])) ch[i] += 32;
    }

    System.out.println(ch);
  }
}
