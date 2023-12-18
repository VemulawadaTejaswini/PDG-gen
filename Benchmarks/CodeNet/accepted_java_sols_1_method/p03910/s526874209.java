import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long i = 1;
    while (i * (i + 1) / 2 < N) i++;
    StringBuilder sb = new StringBuilder();
    for (int j = 1; j <= i; j++) if (j != i * (i + 1) / 2 - N) sb.append(j).append('\n');
    System.out.print(sb.toString());
  }
}
