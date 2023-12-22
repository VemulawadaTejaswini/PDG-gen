import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int digits = N;
    int sum = 0;
    while (digits != 0) {
      sum += digits % 10;
      digits /= 10;
    }
    if (N % sum == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
