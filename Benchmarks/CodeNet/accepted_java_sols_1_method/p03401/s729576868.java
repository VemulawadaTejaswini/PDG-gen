import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] A = new int[N + 10];
    A[0] = 0;
    A[N + 1] = 0;
    long sum = 0;
    long ans = 0;
    for (int i = 1; i <= N; i++){
      A[i] = scanner.nextInt();
    }
    for (int i = 0; i <= N; i++){
      sum += Math.abs(A[i+1] - A[i]);
    }
    for (int i = 0; i < N; i++){
      ans = sum + Math.abs(A[i + 2] - A[i]) - Math.abs(A[i + 2] - A[i + 1])
      - Math.abs(A[i + 1] - A[i]);
      System.out.println(ans);
      ans = 0;
    }
  }
}
