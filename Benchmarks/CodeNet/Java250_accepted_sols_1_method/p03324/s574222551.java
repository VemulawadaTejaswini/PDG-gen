import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int D = in.nextInt();
    int N = in.nextInt();
    in.close();
    System.out.println((int)(Math.pow(100, D) * (N + N / 100)));
  }
}