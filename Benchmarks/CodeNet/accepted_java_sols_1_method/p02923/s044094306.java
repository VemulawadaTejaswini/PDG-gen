import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    String[] hs = sc.nextLine().split(" ");
    int[] h = new int[n];
    for (int i = 0; i < n; i++) h[i] = Integer.parseInt(hs[i]);
    sc.close();
    int max = 0;
    int count = 0;
    for (int i = 1; i < n; i++) {
      count = h[i] <= h[i - 1] ? count + 1 : 0;
      max = Math.max(max, count);
    }
    System.out.println(max);
  }
}
