import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    System.out.println(n.chars().map(c -> c - '0').sum() % 9 == 0 ? "Yes" : "No");
  }
}