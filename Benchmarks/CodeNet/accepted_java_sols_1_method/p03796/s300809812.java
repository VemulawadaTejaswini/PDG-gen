import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int N = s.nextInt();
    long power = 1;
    for (int i = 1; i <= N; i++) {
      power = i * power % 1000000007;
    }
    System.out.println(power);
  }
}
