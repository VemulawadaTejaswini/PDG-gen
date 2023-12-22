import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    String word1 = console.next();
    String word2 = console.next();
    String end = word2.substring(0, word1.length());
    if (word1.compareTo(end) == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
