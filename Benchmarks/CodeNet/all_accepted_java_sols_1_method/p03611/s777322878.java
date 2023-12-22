import java.util.Scanner;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    TreeMap<Integer, Integer> count = new TreeMap<>();
    for (int i = 0; i < N; i++) {
      int a = scanner.nextInt();
      count.put(a, count.getOrDefault(a, 0) + 1);
    }

    Integer[] keys = count.keySet().toArray(new Integer[0]);
    int num = count.get(keys[0]);
    for (int i = 1; i < keys.length; i++) {
      int c = count.get(keys[i]);
      if (keys[i - 1] + 1 == keys[i])
        c += count.get(keys[i - 1]);
      if (i < keys.length - 1 && keys[i + 1] == keys[i] + 1)
        c += count.get(keys[i + 1]);
      num = Math.max(num, c);
    }
    System.out.println(num);
  }
}
