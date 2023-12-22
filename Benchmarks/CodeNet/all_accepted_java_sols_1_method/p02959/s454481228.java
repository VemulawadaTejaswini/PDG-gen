import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    
    long[] A = new long[N+1];
    for(int i = 0; i < N+1; i++){
      A[i] = scanner.nextLong();
    }
    
    long[] B = new long[N];
    for(int i = 0; i < N; i++){
      B[i] = scanner.nextLong();
    }
    
    /*
    * 勇者はn,n+1の順に倒していくと多く倒せる
    * 次の勇者はn番目を倒すことができないから
    */
    
    long total = 0;
    
    for(int n = 0; n < N; n++){
      long amount = Math.min(A[n], B[n]);
      B[n] -= amount;
      total += amount;
      
      amount = Math.min(A[n+1], B[n]);
      A[n+1] -= amount;
      total += amount;
    }
 
    System.out.println(total);
  }
}