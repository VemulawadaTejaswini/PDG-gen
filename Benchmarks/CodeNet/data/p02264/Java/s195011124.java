import java.util.Scanner;

class Process {
  String name;
  int time;
}

public class Main {
  private static int head, tail;
  private final static int MAX = 100000;
  private static Process[] Queue = new Process[MAX];

  public static void main(final String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    int elaps = 0;
    for (int i = 1; i <= n; i++) {
      Queue[i] = new Process();
      Queue[i].name = sc.next();
      Queue[i].time = sc.nextInt();
    }
    head = 1;
    tail = n + 1;
    while (head != tail) {
      Process p = dequeue();
      int time = Math.min(p.time, q);
      p.time -= time;
      elaps += time;
      if (p.time > 0)
        enqueue(p);
      else {
        System.out.printf("%s %d\n", p.name, elaps);
      }
    }
  }

  private static void initialize() {
    head = tail = 0;
  }

  private static boolean isEmpty() {
    return head == tail;
  }

  private static boolean isFull() {
    return head == (tail + 1) % MAX;
    // if (tail == MAX) {
    // return head == 0;
    // } else
    // return tail - 1 == head;
  }

  private static void enqueue(Process x) {
    if (isFull()) {
      throw new Error("Queue Over Flow");
    }
    Queue[tail] = x;
    if (tail + 1 == MAX)
      tail = 0;
    else
      tail++;
  }

  private static Process dequeue() {
    if (isEmpty()) {
      throw new Error("Queue Under Flow");
    }
    Process x = Queue[head];
    if (head + 1 == MAX)
      head = 0;
    else
      head++;
    return x;
  }

}
