import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    sc.close();
    int count = 0;
    for (int i = 0; i < s.length() - 1 - i; i++) {
      if (s.charAt(i) == s.charAt(s.length() - 1 - i)) {
        continue;
      }
      count++;
    }
    System.out.println(count);
  }
}