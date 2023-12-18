import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

class Main {
  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    Deque<String> names = new ArrayDeque<String>(50000);
    Deque<Integer> times = new ArrayDeque<Integer>(50000);

    for (int i = 0; i < n; i++) {
      names.offerLast(sc.next());
      times.offerLast(sc.nextInt());
    }

    execution(q, names, times);
  }

  public static void execution(int q, Deque<String> names, Deque<Integer> times) {
    int time;
    String name;
    int currentTime = 0;

    while(true) {
      try {
        name = names.removeFirst();
        time = times.removeFirst();

        if (time - q <= 0) {
          currentTime += time;
          System.out.println(name + " " + currentTime);
          continue;
        }

        time -= q;
        currentTime += q;

        names.offerLast(name);
        times.offerLast(time);

      } catch (Exception e) {
        break;
      }
    }
  }
}

