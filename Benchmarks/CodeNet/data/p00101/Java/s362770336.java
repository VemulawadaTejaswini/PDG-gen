import java.util.*;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    final int n = sc.nextInt();
    sc.nextLine();

    for(int i = 0; i < n; i++) {
      System.out.println(sc.nextLine().replaceAll("Hoshino", "Hoshina"));
    }
  }

  private final Scanner sc = new Scanner(System.in);
}