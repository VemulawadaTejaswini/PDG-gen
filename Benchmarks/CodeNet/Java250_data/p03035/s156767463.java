import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    int B = scanner.nextInt();

    int fare;
    if (A >= 13) {
      fare = B;
    } else if (A >= 6) {
      fare = B / 2;
    } else {
      fare = 0;
    }

    System.out.println(fare);
  }
}