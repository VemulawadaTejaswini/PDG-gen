import java.util.*;

public class Main {
  static int head = 0;
  static int tail = 0;
  static int max = 100000;
  static int[] queue = new int[max];
  static String[] str = new String[max];

  public static void initialize() {
    head = tail = 0;
  }
  public static boolean isEmpty() {
    return head == tail;
  }
  public static boolean isFull() {
    return head == (tail + 1) % max;
  }
  public static void enqueue(int x, String s) {
    if(isFull()) {
      throw new IllegalArgumentException("オーバーフロー");
    } else {
      queue[tail] = x;
      str[tail] = s;
      if(tail + 1 == max) {
        tail = 0;
      } else {
        tail++;
      }
    }
  }
  public static int dequeue() {
    if(isEmpty()) {
      throw new IllegalArgumentException("アンダーフロー");
    } else {
      int x = queue[head];
      if(head + 1 == max) {
        head = 0;
      } else {
        head++;
      }
      return x;
    }
  }
  public static String destr() {
    if(head == 0) {
      return str[max - 1];
    } else {
      return str[head - 1];
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    String s = "";
    int a = 0;
    int time = 0;
    for(int i = 0; i < n; i++) {
      s = sc.next();
      a = sc.nextInt();
      if(a <= q) {
        time += a;
        System.out.println(s + " " + time);
      } else {
        time += q;
        enqueue(a - q, s);
      }
    }
    while(!isEmpty()) {
      a = dequeue();
      s = destr();
      if(a <= q) {
        time += a;
        System.out.println(s + " " + time);
      } else {
        time += q;
        enqueue(a - q, s);
      }
    }
  }
}

