import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nl = sc.next();
    long sum = 0;

    for (int i = 0; i < nl.length(); i++) {
      sum += Integer.parseInt(nl.substring(i, i+1));
    }
    if (sum % 9 == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}