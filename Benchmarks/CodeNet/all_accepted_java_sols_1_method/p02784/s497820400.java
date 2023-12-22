import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int N = scanner.nextInt();
    long sum = 0;
    for (int i = 0; i < N; i++) {
      sum += scanner.nextInt();
    }
    System.out.println(H <= sum ? "Yes" : "No");
  }
}