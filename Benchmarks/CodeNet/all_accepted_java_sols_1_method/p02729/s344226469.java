import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();

    int sum = 0;
    if (N >= 2) {
      for (int i = N-1; i > 0; i--) {
        sum += i;
      }
    }

    if (M >= 2) {
      for (int i = M-1; i > 0; i--) {
        sum += i;
      }
    }

    System.out.println(sum);

  }

}