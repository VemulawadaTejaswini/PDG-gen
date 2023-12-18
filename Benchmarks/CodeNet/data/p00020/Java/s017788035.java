import java.util.*;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    while(sc.hasNext()) {
      System.out.println(sc.nextLine().toUpperCase(Locale.ENGLISH));
    }
  }

  private final Scanner sc = new Scanner(System.in);
}