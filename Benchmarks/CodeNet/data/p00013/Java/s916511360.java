import java.util.*;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    while(sc.hasNext()) {
      int id = sc.nextInt();

      if(id == 0) System.out.println(dq.pop());
      else dq.push(id);
    }
  }

  private final Scanner sc = new Scanner(System.in);
  private final Deque<Integer> dq = new ArrayDeque<Integer>();
}