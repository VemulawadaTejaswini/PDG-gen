import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    int C = Integer.parseInt(sc.next());
    int K = Integer.parseInt(sc.next());

    int max = Math.max(A, Math.max(B, C));
    int sum = A + B + C - max;
    sum += max * Math.pow(2, K);

    System.out.println(sum);

  }
}