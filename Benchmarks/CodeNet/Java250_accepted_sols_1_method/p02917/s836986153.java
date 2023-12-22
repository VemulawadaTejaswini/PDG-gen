import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n - 1];

    for(int i = 0; i < n - 1;i++){
      b[i] = sc.nextInt();
    }

    // B[i] ≥ max ( A[i] , A[i + 1])
    // B[i + 1] ≥ max ( A[i + 1] , A[i + 2])
    // A[i] <= min(B[i - 1], B[i] )
    a[0] = b[0];
    int score = a[0];
    for(int i = 1; i < n - 1;i++){
      a[i] = Math.min(b[i - 1], b[i]);
      score += a[i];
    }
    if(n != 1){
      a[n - 1] = b[n - 2];
      score += a[n - 1];
    }

    System.out.println(score);
  }
}
