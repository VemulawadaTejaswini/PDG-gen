import java.util.Scanner;

public class Main {
  public static void main(String[] main) {
    Scanner input = new Scanner(System.in);
    String[] ss = input.nextLine().split(" ");
    int n = Integer.parseInt(ss[0]);
    int m = Integer.parseInt(ss[1]);
    ss = input.nextLine().split(" ");
    int total = 0;
    for (int i = 0; i < m; i++) {
      total += Integer.parseInt(ss[i]);
    }
    if (n < total) {
      System.out.println("-1");
    } else {
      System.out.println(n - total);
    }
  }
}