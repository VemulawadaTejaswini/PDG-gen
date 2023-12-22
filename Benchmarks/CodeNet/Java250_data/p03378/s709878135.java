import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int X = sc.nextInt();
    int A[] = new int[M];
    
    for(int i=0; i<M; i++){
      A[i] = sc.nextInt();
      if(X<A[i]){
        if(i <= (double)M/2){
          System.out.println(i);
          break;
        } else {
          System.out.println(M-i);
          break;
        }
      }
    }
  }
}