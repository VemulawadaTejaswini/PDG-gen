import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    HashMap<Integer, Integer> freq = new HashMap<>();
    for (int i = 0; i < N; i++) {
      int a = scanner.nextInt();
      freq.put(a, freq.getOrDefault(a, 0) + 1);
    }

    int count = 0;
    int numEven = 0;
    for (int f : freq.values()) {
      count += f / 2;
      if (f % 2 == 0) numEven++;
    }
    count -= numEven / 2;
    System.out.println(N - count * 2);
  }
}
