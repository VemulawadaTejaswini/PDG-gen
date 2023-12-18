import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    String[] strs = str.split(" ");
    int n = Integer.parseInt(strs[0]);
    int k = Integer.parseInt(strs[1]);

    str = scan.nextLine();
    strs = str.split(" ");
    int[] p = new int[n];
    for (int i = 0; i < n; i++) {
      p[i] = Integer.parseInt(strs[i]);
    }
    str = scan.nextLine();
    strs = str.split(" ");
    int[] c = new int[n];
    for (int i = 0; i < n; i++) {
      c[i] = Integer.parseInt(strs[i]);
    }

    long max = -999999999;

    for (int i = 0; i < n; i++) {
      long score = 0;
      int next = i+1;
      for (int j = 0; j < k; j++) {
        next = p[next-1];
        score += c[next-1];
        if (score > max) max = score;
      }
    }
    System.out.println(max);
  }
}
