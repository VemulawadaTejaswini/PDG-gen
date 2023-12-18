import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    for (int i = 0; i < s.length(); i++) {
      int i1 = s.charAt(i) + n;
      if (i1 > 90) {
        i1 = i1 - 26;
      }
      System.out.print((char) i1);
    }
  }
}