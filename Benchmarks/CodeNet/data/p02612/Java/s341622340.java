import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    System.out.println(1000 - (N % 1000 == 0 ? N % 1000 : 1000));
  }
}
