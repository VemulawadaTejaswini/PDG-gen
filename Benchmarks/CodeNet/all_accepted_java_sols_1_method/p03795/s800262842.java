import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int x = 800 * N;
    int y = 200 * (N / 15);
    System.out.println(x - y);
  }
}
