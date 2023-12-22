import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = 0;
    int B = 0;
    int min = Integer.MAX_VALUE;
    
    for(int i = 1; i<N; i++){
      A=i;
      B=N-i;
      
      int sum = 0;
      while(A>0){
        sum += A%10;
        A /= 10;
      }
      while(B>0){
        sum += B%10;
        B /= 10;
      }
      min = Math.min(min, sum);
    }
    
    System.out.println(min);
  }
}
        
    
    
    