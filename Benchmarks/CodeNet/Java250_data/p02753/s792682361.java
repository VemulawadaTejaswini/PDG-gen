import java.util.Scanner;

public class Main {

  public static void main(String[] args ){

    Scanner sc = new Scanner(System.in);

    String S = sc.next();
    boolean containsA = S.contains("A");
    boolean containsB = S.contains("B");

    System.out.println((containsA && containsB) ? "Yes" : "No");
  }
}
