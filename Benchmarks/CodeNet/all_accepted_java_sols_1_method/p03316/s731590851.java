import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = N;
    int sum = 0;
    while(N > 0) {
      sum += N % 10;
      N /= 10;
    }
    if (K % sum == 0) System.out.println("Yes");
    else System.out.println("No");
  }
}
