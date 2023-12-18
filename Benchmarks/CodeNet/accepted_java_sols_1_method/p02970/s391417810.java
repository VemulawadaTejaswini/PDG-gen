import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int D = scanner.nextInt();

    int observedRange = D * 2 + 1;
    int answer;
    if (N % observedRange == 0) {
      answer = N / observedRange;
    } else {
      answer = N / observedRange + 1;
    }

    System.out.println(answer);

  }
}