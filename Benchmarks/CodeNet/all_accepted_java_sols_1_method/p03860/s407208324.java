import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    String s[] = sc.nextLine().split(" ");
    System.out.println(s[0].substring(0, 1) + s[1].substring(0, 1) + s[2].substring(0, 1));
  }
}