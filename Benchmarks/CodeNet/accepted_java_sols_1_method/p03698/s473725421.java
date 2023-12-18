import java.util.*;
import java.text.*;
public class Main {
  public static void main(String[] args) throws ParseException {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    char[] words = line.toCharArray();
    int count = 0;
    for (int i = 0; i < line.length(); i++) {
      for (int j = 1; j < line.length() - i; j++) {
        if (words[i] == words[i + j]) {
          count++;
        }
      }
    }
    if (count == 0) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }
  }
}