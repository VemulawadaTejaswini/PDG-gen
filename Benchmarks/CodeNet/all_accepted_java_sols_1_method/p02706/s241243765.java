import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int M = scan.nextInt();
    int sum = 0;
    for(int i=0; i<M; i++) {
      sum += scan.nextInt();
    }
    scan.close();

    System.out.println(N<sum ? -1 : N-sum);
  }
}