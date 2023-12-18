import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String W = sc.nextLine();
      int Wtotal = 0;
      while (sc.hasNext()) {
        String T = sc.next();
        if (T != "END_OF_TEXT") {
          T = T.toLowerCase();
          char line[] = T.toCharArray();
          if (line.length == W.length()) {
            int total = 0;
            for (int i = 0; i< W.length(); i++) {
              char Wj = W.charAt(i);
              char Tj = T.charAt(i);
              if (Wj == Tj) total++;
              }
              if (total == W.length()) Wtotal++;
          }
        }
      }
      System.out.println(Wtotal);
    }
}
