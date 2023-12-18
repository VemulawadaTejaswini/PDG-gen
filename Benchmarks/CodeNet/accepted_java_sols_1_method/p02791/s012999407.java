import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int n = scanner.nextInt();
    int min = 200001;
    int count = 0;
    for (int i = 0; i < n; i++) {
      int p = scanner.nextInt();
      if(p <= min) {
        count++;
        min = p;
      }
    }
    System.out.println(count);
  }
}
