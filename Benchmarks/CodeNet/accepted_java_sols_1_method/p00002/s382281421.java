
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    List<Integer> values = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    while (scanner.hasNext()) {
      Integer a = scanner.nextInt();
      Integer b = scanner.nextInt();

      System.out.println(String.valueOf(a + b).length());
    }
  }
}

