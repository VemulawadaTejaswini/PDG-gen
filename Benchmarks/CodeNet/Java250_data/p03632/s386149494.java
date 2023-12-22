import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int A = sc.nextInt();
      	int B = sc.nextInt();
      	int C = sc.nextInt();
      	int D = sc.nextInt();
      	
      	int max = 0;
      	int min = 0;
      	if(A <= C){
          max = C;
        }else{
          max = A;
        }
      
      	if(B <= D){
          min = B;
        }else{
          min = D;
        }
		int result = 0;
      	if(max <= min){
          result = min - max;
        }
      
      	System.out.println(result);
    }
}