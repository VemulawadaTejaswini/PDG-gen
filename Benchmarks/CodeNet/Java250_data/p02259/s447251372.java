import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    List<Integer> numbers = new ArrayList<Integer>();
    for (int i = 0; i < N; ++i) {
      numbers.add(scanner.nextInt());
    }

    int temp, count = 0;
    for (int i = 0; i + 1 < N; ++i) {
      for (int j = 0; j + 1 < N - i; ++j) {
        if (numbers.get(j) > numbers.get(j + 1)) {
          temp = numbers.get(j + 1);
          numbers.set(j + 1, numbers.get(j));
          numbers.set(j, temp);
          ++count;
        }
      }
    }

    if (N == 0) count = 1;

    for (int i = 0; i < N - 1; ++i) System.out.print(numbers.get(i) + " ");
    System.out.println(numbers.get(N - 1) + "\n" + count);
  }
}
