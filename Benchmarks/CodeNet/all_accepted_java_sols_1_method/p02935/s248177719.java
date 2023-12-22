import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int[] A;
    A = new int[N+1];
    
    // ソートする
    for (int i= 1; i <= N; i++){
      A[i] = scan.nextInt();
    }
    Arrays.sort(A);
    float result=A[1];
    for (int j= 2; j <= N; j++){
      result=result/2+(float)A[j]/2;
    }
    System.out.println(result);
  
  }
 
}