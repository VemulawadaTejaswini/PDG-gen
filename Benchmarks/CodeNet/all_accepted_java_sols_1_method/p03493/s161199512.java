import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] list = scanner.next().split("");
    int count = 0;
    for (String s : list) {
      if (Integer.parseInt(s) == 1) {
        count++;
      }
    }

    System.out.println(count);

    scanner.close();
  }
}
