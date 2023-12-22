import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long power = 1;
    int mod = 1000000007;
    for (int i = 1; i <= n; i++) {
      power = power * i % mod;
    }
    System.out.println(power);
  }
}