import java.util.Scanner;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    Queue<Integer> items = new PriorityQueue<Integer>(Collections.reverseOrder());
    for (int i = 0; i < N; i++)
      items.add(sc.nextInt());
    for (int i = 0; i < M; i++)
      items.add(items.poll() / 2);
    long sum = 0;
    for (int i = 0; i < N; i++)
      sum += items.poll();
    System.out.println(sum);
  }
}