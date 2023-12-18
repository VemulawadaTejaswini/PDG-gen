import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int H = scanner.nextInt();
    int W = scanner.nextInt();
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int p = 0;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (j < A) sb.append(p);
        else sb.append(1 - p);
      }
      sb.append('\n');
      if (i == B - 1) p = 1 - p;
    }
    System.out.println(sb.toString());
  }
}
