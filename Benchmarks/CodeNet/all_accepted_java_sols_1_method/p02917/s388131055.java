import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int[] B = new int[N];
    
    for (int i=1; i<N; i++) {
      B[i] = scan.nextInt();
    }
   
    int sum= B[1] + B[N-1];
    
    for (int j=2; j<N; j++){
      sum += Math.min(B[j-1],B[j]);
    }
 
    System.out.println(sum);
  
  }
 
}