import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] s = sc.next().split("");

    String ans = "Good";
    if (s[0].equals(s[1])) ans = "Bad";
    if (s[1].equals(s[2])) ans = "Bad";
    if (s[2].equals(s[3])) ans = "Bad";

    System.out.println(ans);
  }
}
