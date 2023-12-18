import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int K = scanner.nextInt();
    Queue<Long> queue = new LinkedList<>();
    for (long i = 1; i <= 9; i++) queue.add(i);
    long num = 1;
    for (int i = 0; i < K; i++) {
      num = queue.remove();
      long next = num * 10 + num % 10;
      if (next % 10 != 0) queue.add(next - 1);
      queue.add(next);
      if (next % 10 != 9) queue.add(next + 1);
    }
    System.out.println(num);
  }
}
