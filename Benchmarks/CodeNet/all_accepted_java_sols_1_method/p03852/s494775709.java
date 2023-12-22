
import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    String[] vowel = {"a", "e", "i", "o", "u"};

    for (String s : vowel) {
      if (str.equals(s)) {
        System.out.println("vowel");
        return;
      }
    }
    System.out.println("consonant");
  }
}
