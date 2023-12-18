import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String s = scanner.nextLine();
      String t = scanner.nextLine();
      int counter = 0;
      int count = 0;
      for (int j = 0; j <= (s.length() - t.length()); j++) {
        for (int i = 0; i < t.length(); i++) {
          if (t.charAt(i) == s.charAt(j + i)) {
            counter = counter + 1;
          }
        }
        if (count == 0 || counter > count) {
          count = counter;
        }
        counter = 0;
      }
      System.out.println(t.length() - count);
    }
}
