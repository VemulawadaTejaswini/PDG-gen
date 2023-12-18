import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    int n = reader.nextInt();
    int tScore = 0, hScore = 0;
    for (int i = 0; i < n; i++) {
      String tStr = reader.next();
      String hStr = reader.next();
      if (tStr.compareTo(hStr) > 0) {
        tScore += 3;
      }
      else if (tStr.compareTo(hStr) == 0) {
        tScore += 1;
        hScore += 1;
      }
      else {
        hScore += 3;
      }
    }
    System.out.println(tScore + " " + hScore);
  }
}