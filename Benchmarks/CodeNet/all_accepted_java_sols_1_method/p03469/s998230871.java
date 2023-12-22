import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    s = s.replaceFirst("7", "8");
    System.out.println(s);

  }
}