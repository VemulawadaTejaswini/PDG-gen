import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    String s = stdin.next();
    String p = stdin.next();
    String ss = s + s;
    System.out.println(ss.contains(p) ? "Yes" : "No");
  }

}