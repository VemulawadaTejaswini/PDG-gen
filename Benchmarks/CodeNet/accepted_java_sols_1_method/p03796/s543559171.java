import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    long mod = (long) (Math.pow(10, 9) + 7);
    long n = sc.nextLong();
    long pow = 1;
    
    for (int i = 1; i <= n; i++) {
      pow = (pow * i) % mod;
    }
    
    System.out.println(pow);

  }
}