import java.util.Scanner;

public class Main {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    
    int Q = sc.nextInt();
    
    
    for (int i = 0; i < Q; i++) {
      long sum = 0;
      int target = sc.nextInt();
      int value = sc.nextInt();
      for (int j = 0; j < N; j++) {
        if (A[j] == target) {
          A[j] = value;
        }
        sum += A[j];
      }
      System.out.println(sum);
    }

    
  }
}
