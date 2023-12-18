import java.util.*;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    for(int i = 0; i < 5; i++) {
      lst.add(sc.nextInt());
    }

    Collections.sort(lst);

    for(int i = 4; i > 0; i--) {
      System.out.print(lst.get(i) + " ");
    }

    System.out.println(lst.get(0));
  }

  private final Scanner sc = new Scanner(System.in);
  private final List<Integer> lst = new ArrayList<Integer>();
}