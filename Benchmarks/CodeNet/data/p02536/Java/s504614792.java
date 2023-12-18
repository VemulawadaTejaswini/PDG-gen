import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] A = new int[M];
    int[] B = new int[M];
    
    int[] X = new int[N];
    int Y = 0;
    
    for(int j = 0; j < N; j++){
      X[j] = 0;  
    }
    
    for(int i = 0; i < M; i++){
      A[i] = sc.nextInt();
      B[i] = sc.nextInt();
      X[(A[i]-1)] += 1;
      X[(B[i]-1)] += 1;
    }
    
    for(int k = 0; k < N; k++){
      if(X[k] == 0){
        Y += 1;
      }
    }
    System.out.println(Y);
     }
}