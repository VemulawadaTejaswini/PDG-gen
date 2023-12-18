import java.util.*;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    int w = sc.nextInt();
    int n = sc.nextInt();

    int[] lines = new int[w];
    for(int i = 0; i < w; i++) lines[i] = i + 1;

    sc.useDelimiter("[,\n]");

    for(int i = 0; i < n; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;

      int tmp = lines[a];
      lines[a] = lines[b];
      lines[b] = tmp;
    }

    for(int l : lines) {
      System.out.println(l);
    }
  }

  private final Scanner sc = new Scanner(System.in);
}