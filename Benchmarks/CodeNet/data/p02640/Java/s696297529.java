import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String line = sc.nextLine();

    int X = Integer.parseInt(line.split(" ")[0]);
    int Y = Integer.parseInt(line.split(" ")[1]);

    int kame = 0; // 2
    int turu = 0; // 4

    for (int kameCount = kame; kameCount <= X; kameCount++ ) {
      for (int turuCount = turu; turuCount <= X-kameCount; turuCount++) {
        if (2 * kameCount + 4 * turuCount == Y) {
          System.out.println("Yes");
          return;
        }
      }
    }
    System.out.println("No");





  }
}