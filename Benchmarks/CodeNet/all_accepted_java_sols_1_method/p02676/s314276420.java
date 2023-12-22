import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    String s = sc.next();
    System.out.println(s.length() <= k ? s : s.substring(0, k) + "...");
  }
}