import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String c = sc.next();
    sc.close();

    String result;
    if (c.equals("a") || c.equals("i") || c.equals("u") || c.equals("e") || c.equals("o")) {
      result = "vowel";
    } else {
      result = "consonant";
    }
    System.out.println(result);
  }
}
