import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    System.out.println((K % 2 == 0) ? K / 2 * K / 2 : K / 2 * (K / 2 + 1));
  }
}