import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] A = new int[M];
    int[] B = new int[M];

    for(int i = 0; i < M; i++){
      A[i] = sc.nextInt();
      B[i] = sc.nextInt();
    }
    System.out.println(N - 1 - M);
    
    
     }
}