import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N+1];	// i町の敵の数
    int[] B = new int[N];	// 各勇者の倒せる敵の数
    
    for(int i=0; i<N+1; i++){
      A[i] = sc.nextInt();
    }
    for(int i=0; i<N; i++){
      B[i] = sc.nextInt();
    }

    long cnt = 0;
    for(int i=0; i<N; i++){
      int rem1 = A[i] - B[i];
      if (B[i] > A[i]){
        cnt += A[i];
        B[i] -= A[i];
        int rem2 = A[i+1] - B[i];
        if (B[i] > A[i+1]){
          cnt += A[i+1];
          A[i+1] = 0;
        } else {
          cnt += B[i];
          A[i+1] = rem2;
        }
      } else {
      	cnt += B[i];
      }
    }
    
    System.out.print(cnt);
    sc.close();
		
  }
}