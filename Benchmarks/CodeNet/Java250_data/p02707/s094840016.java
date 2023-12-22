import java.util.Scanner;

public class Main {
  public static void main(String[] main) {
    Scanner input = new Scanner(System.in);
    int n = Integer.parseInt(input.nextLine());
    String[] ss = input.nextLine().split(" ");
    int[] xs = new int[n];
    for (int i = 0; i < n-1; i++) {
      int x = Integer.parseInt(ss[i]) - 1;
      xs[x] += 1;
    }
    for (int i = 0; i < n; i++) {
      System.out.println(xs[i]);
    }
  }
}