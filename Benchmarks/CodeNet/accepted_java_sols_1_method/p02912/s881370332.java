import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] line = sc.nextLine().trim().split(" ");
    long n = Long.valueOf(line[0]);
    long m = Long.valueOf(line[1]);
    Queue<Long> queue = new PriorityQueue<>(Collections.reverseOrder());
    line = sc.nextLine().trim().split(" ");
    for (String s : line) {
      queue.add(Long.valueOf(s));
    }
    for (int i = 0; i < m; i++) {
      long tmp = queue.poll();
      tmp /= 2;
      queue.add(tmp);
    }
    long sum = 0;
    for (long q : queue) {
      sum += q;
    }
    System.out.println(sum);
  }
}