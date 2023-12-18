import java.util.*;
public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i=0; i<N; i++){
      A[i] = sc.nextInt();
    }
    
    int ans = 0;
    
    for (int i=0; i<N; i++){
      if (i+1 == N){
        break;
      }
      if (A[i]>A[i+1]){
        int sum = 0;
        
        for (int j=i+1; j<N; j++){
          if (A[i]<A[j]){
            ans += sum;
            i = j-1;
            break;
          } else {
            sum += A[i]-A[j];
          }
        }
      }
    }
    //System.out.println(); 
    System.out.println(ans);  
  }
}