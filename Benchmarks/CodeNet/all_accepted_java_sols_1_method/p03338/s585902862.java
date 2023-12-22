import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    String lineOriginal = sc.next();
    String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    int max = 0;
    for (int i = 1; i < number; i++) {
      String line1 = lineOriginal.substring(0, i);
      String line2 = lineOriginal.substring(i, number);
      int count = 0;
      for (int j = 0; j < 26; j++) {
        if (line1.contains(alphabet[j]) && line2.contains(alphabet[j])) {
          count++;
        }
      }
      if (count > max) {
        max = count;
      }
     

      
    }
    System.out.println(max);
  }
}