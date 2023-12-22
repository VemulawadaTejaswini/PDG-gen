import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String t = sc.nextLine();
    int count = 0;
    for (int i = 0; i < 3; i++) {
      count += s.charAt(i) == t.charAt(i) ? 1 : 0;
    }
    sc.close();
    System.out.println(count);
  }
}
