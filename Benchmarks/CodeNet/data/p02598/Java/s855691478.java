import java.util.*;

public class Main {
  
  private static int[] A;
  private static int[] C;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] NK = sc.nextLine().split(" ");
    int N = Integer.parseInt(NK[0]);
    int K = Integer.parseInt(NK[1]);
    A = new int[N];
    C = new int[N];
    
    for(int i = 0; i < N; ++i) {
      A[i] = sc.nextInt();
    }
    
    int tem = 0;
    for(int i = 1; i < N; ++i) {
      for(int j = i; j > 0; --j) {
        if(A[j] > A[j - 1]) {
          tem = A[j];
          A[j] = A[j - 1];
          A[j - 1] = tem;
        }
      }
    }
    
    for(int i = 0; i < K; ++i) {
      ++C[0];
      reSort();
    }
    
    System.out.println(A[0] / (C[0] + 1) == (double)A[0] / (C[0] + 1) ? A[0] / (C[0] + 1) : A[0] / (C[0] + 1) + 1);
  }
  
  public static void reSort() {
    int num = 1;
    int shelA = A[0];
    int shelC = C[0];
    
    for(;num < A.length; ++num) {
      if((double)shelA / (shelC + 1) > (double)A[num] / (C[num] + 1)) {
        break;
      }
    }
    for(int i = 1; i < num; ++i) {
      A[i - 1] = A[i];
      C[i - 1] = C[i];
      if(i == num - 1) {
        A[i] = shelA;
        C[i] = shelC;
      }
    }
    return;
  }
}