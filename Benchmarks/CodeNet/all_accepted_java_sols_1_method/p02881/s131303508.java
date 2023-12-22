import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long tmp = n;
    long result = n + 1;
    for (long i = 1; i < tmp; i++) {
      tmp = n / i;
      if (n % i == 0)
        if (result > i + tmp)
          result = i + tmp;
    }
    System.out.println(result - 2);
  }
}