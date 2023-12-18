import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    var cash = Integer.parseInt(str);

    while (1000 < cash) {
      cash = cash - 1000;
    }

    var ans = 1000 - cash;

    System.out.println(ans);
    scan.close();
  }
}
