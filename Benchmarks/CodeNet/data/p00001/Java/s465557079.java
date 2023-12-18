import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int a = new Scanner(System.in).nextInt();
    int b = new Scanner(System.in).nextInt();
    int c = new Scanner(System.in).nextInt();
    int d = new Scanner(System.in).nextInt();
    int e = new Scanner(System.in).nextInt();
    int f = new Scanner(System.in).nextInt();
    int g = new Scanner(System.in).nextInt();
    int h = new Scanner(System.in).nextInt();
    int i = new Scanner(System.in).nextInt();
    int j = new Scanner(System.in).nextInt();
    int[] heights = { a, b, c, d, e, f, g, h, i, j };
    java.util.Arrays.sort( heights );
    for (int x = 0; i < 3; i++) {
      System.out.println(heights[x]);
    }
  }
}