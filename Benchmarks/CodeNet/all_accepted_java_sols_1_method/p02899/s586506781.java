import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[] = new int[N+1];
    
    for(int i=1; i<=N; i++){
      int b = sc.nextInt();
      A[b] = i;
    }
    
    for(int i=1; i<=N; i++){
      System.out.println(A[i]+" ");//arraneg student from No1
    }
  }
}
    