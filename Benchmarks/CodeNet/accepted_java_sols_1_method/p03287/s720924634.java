import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int sum = 0;
    HashMap<Integer, Integer> freq = new HashMap<>();
    freq.put(0, 1);
    for (int i = 0; i < N; i++) {
      sum += scanner.nextInt();
      sum %= M;
      freq.put(sum, freq.getOrDefault(sum, 0) + 1);
    }

    long count = 0;
    for (Map.Entry<Integer, Integer> entry: freq.entrySet()){
      long c = entry.getValue();
      if (c > 1) {
        count += c * (c - 1) / 2;
      }
    }
    System.out.println(count);
  }
}
