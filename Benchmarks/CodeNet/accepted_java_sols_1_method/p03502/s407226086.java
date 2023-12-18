import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int num = n;
    long total = 0;
    while(num != 0) {
      total += (num % 10);
      num /= 10;
    }
    if (n % total == 0) System.out.println("Yes");
    else System.out.println("No");
  }
}
