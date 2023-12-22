import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String a = sc.nextLine();
    byte[] b = a.getBytes();
    char[] c = Character.toChars(b[0] + 1);
    System.out.println(new String(c));
  }
}
