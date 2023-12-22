import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int aScore = 0;
    int bScore = 0;
    for (int i = 0; i < n; i++) {
      String a = s.next();
      String b = s.next();
      if (a.compareTo(b) > 0) {
        aScore += 3;
      } else if (a.compareTo(b) < 0) {
        bScore += 3;
      } else {
        aScore += 1;
        bScore += 1;
      }
    }
    s.close();
    System.out.println(aScore + " " + bScore);
  }
}

