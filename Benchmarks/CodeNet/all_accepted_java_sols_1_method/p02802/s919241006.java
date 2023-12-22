import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    boolean[] ac = new boolean[n];
    long[] wrong = new long[n];
    for (int i = 0; i < m; i++) {
      int p = scan.nextInt();
      String s = scan.next();
      if (!ac[p-1]) {
        if (s.equals("WA")) wrong[p-1]++;
        else ac[p-1] = true;
      }
    }

    int wr = 0;
    int acc = 0;
    for (int i = 0; i < ac.length; i++) {
      if (ac[i]) {
        acc++;
        wr += wrong[i];
      }
    }

    System.out.println(acc + " " + wr);
  }
}
