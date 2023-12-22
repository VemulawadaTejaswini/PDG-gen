import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int [] A = new int[1000];

    for (int i = 1; i < 1000; i++) {
      A[i] = A[i-1] + i;
      if ( b - a  == i) {
          System.out.println(A[i]-b);
          break;
      }
    }
  }
}