import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int K = sc.nextInt();
    
      if(K<=A){
    System.out.println(K);
      }else if(K<=A+B){
	System.out.println(A);
      }else if(K<A+B+C){
    System.out.println(A-(K-A-B));
      }else{
	System.out.println(A-C);	
      }
      }
}