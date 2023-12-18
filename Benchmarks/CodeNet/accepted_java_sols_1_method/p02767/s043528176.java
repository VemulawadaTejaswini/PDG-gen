
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    List<Integer> x = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      x.add(scanner.nextInt());
    }

    int min = Integer.MAX_VALUE;
    for (int i = 0; i < 100; i++) {
      int sum = 0;
      for (int j = 0; j < x.size(); j++) {
        sum += Math.pow(x.get(j)-i, 2);
      }
      min = Math.min(min, sum);
    }
    System.out.println(min);
  }

}
