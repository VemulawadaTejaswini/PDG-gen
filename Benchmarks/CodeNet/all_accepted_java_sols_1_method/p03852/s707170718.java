import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    String c = sc.next();
    switch (c) {
      case "a":
        System.out.println("vowel");
        break;
      case "e":
        System.out.println("vowel");
        break;
      case "u":
        System.out.println("vowel");
        break;
      case "i":
        System.out.println("vowel");
        break;
      case "o":
        System.out.println("vowel");
        break;
      default:
      System.out.println("consonant");
      break;
    }
  }
}