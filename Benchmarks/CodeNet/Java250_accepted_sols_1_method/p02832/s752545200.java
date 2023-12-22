import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = Integer.parseInt(input.nextLine());
    String[] ss = input.nextLine().split(" ");
    int[] xs = new int[n];
    for (int i = 0; i < n; i++) {
      xs[i] = Integer.parseInt(ss[i]);
    }
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (xs[i] == count + 1) {
        count++;
      }
    }
    if (count == 0) {
      System.out.println("-1");
    } else {
      System.out.println(n - count);
    }
  }
}
