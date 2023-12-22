import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();

    int fee = B;
    if (6 <= A && A <= 12) {
      fee = B/2;
    } else if (A <= 5) {
      fee = 0;
    }
    System.out.println(fee);
  }
}

