import java.util.Scanner;

public class Main {
  public static int head, tail;
  private final static int MAX = 100000;
  private static char[] Queue = new char[MAX];

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    while (true) {
      char[] S = sc.next().toCharArray();
      initialize();
      for (char s : S)
        enqueue(s);
      if (Character.toString(S[0]).equals("-"))
        break;
      int n = sc.nextInt();
      for (int i = 0; i < n; i++) {
        int m = sc.nextInt();
        for (int j = 0; j < m; j++) {
          enqueue(dequeue());
        }
      }
      for (int i = head; i < tail; i++) {
        System.out.print(Queue[i]);
      }
      System.out.println();
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
  }

  private static void enqueue(char x) {
    if (isFull()) {
      throw new Error("Queue Over Flow");
    }
    Queue[tail] = x;
    tail = (tail + 1) % MAX;
  }

  private static char dequeue() {
    if (isEmpty()) {
      throw new Error("Queue Under Flow");
    }
    char x = Queue[head];
    head = (head + 1) % MAX;
    return x;
  }

}
