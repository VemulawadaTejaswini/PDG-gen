import java.util.Random;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner stdIn = new Scanner(System.in);

    String line = stdIn.nextLine();
    String ans = "";
    for (int i = 0; i < line.length(); i++) {
      char ch = line.charAt(i);
      if (Character.isLowerCase(ch)) ans += Character.toUpperCase(ch);
      else if (Character.isUpperCase(ch)) ans += Character.toLowerCase(ch);
      else ans += ch;
    }
    System.out.println(ans);
  }
}
