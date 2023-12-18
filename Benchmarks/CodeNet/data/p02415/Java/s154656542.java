import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char c;
    String s;
    s = sc.nextLine();
    for (int i = 0; i < s.length(); i++) {
      c = s.charAt(i);
      if ('a' <= c && c <= 'z') {
        c -= 32;
      } else if ('A' <= c && c <= 'Z') {
        c += 32;
      }
      System.out.printf("%c", c);
    }
    System.out.printf("\n");
  }
}

