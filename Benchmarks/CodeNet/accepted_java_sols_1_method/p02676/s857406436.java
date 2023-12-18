import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int K = scan.nextInt();
    String S = scan.next();
    scan.close();

    System.out.println(S.length() <= K ? S : S.substring(0, K) + "...");
  }
}