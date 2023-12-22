import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int max = in.nextInt();
    int min = max;
    long sum = max;
    for (int i = 0; i < n - 1; i++) {
      int t = in.nextInt();
      if(t > max) {
        max = t;
      }
      else if (t < min) {
        min = t;
      }
      sum += t;
    }
    System.out.println(min + " " + max + " " + sum);
  }
}