import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String c = sc.next();
    char fw = c.charAt(0);
    if (fw == 'a' || fw == 'e' || fw == 'i' || fw == 'o' || fw == 'u') {
      System.out.println("vowel");
    } else {
      System.out.println("consonant");
    }
  }
}