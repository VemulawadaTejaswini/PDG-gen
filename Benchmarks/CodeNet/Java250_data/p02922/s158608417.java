import java.util.Scanner;

public class Main {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int count = 0;
    int sumA = 0;

    while (count < B - 1) {
      count += (A - 1);
      sumA++;
    }

    System.out.print(sumA);

    sc.close();
  }
}