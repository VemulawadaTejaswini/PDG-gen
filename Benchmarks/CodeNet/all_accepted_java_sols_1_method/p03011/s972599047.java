import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    int q = sc.nextInt();
    int r = sc.nextInt();
    sc.close();
    int[] val = {p, q, r};
    Arrays.sort(val);
    System.out.println(val[0] + val[1]);
  }
}