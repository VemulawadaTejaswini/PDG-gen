import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    for (int i = 0, n = sc.nextInt(); i < n; i++)
      if (sc.nextInt() != i + 1)
        count++;
    System.out.println(count == 0 || count == 2 ? "YES" : "NO");
  }
}