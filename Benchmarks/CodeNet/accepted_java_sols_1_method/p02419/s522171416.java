import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String W = reader.next().toLowerCase();
    int count = 0;
    while(true) {
      String T = reader.next();
      if (T.equals("END_OF_TEXT"))  break;
      T = T.toLowerCase();
      if (T.equals(W)) count++;
    }
    System.out.println(count);
  }
}