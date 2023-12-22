import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int M = scan.nextInt();
    int A[] = new int[N];
    int sum = 0;
    for(int i=0; i<N; i++) {
      A[i] = scan.nextInt();
      sum += A[i];
    }
    scan.close();

    Arrays.sort(A);

    if((double)A[N-M]/sum < (double)1/(4*M)) {
      System.out.println("No");
    }
    else {
      System.out.println("Yes");
    }
  }
}