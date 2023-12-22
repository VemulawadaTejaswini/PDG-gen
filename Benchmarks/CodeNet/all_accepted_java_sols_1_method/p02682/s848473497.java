import java.util.*;

public class Main{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int k = sc.nextInt();
		int count =0;
		
		
			if(A<=k && 0<k){
			count += A;
			k=k-A;
			A=0;
			}
			
			else if(A>k){
			count +=k;
			A=0;
			}
			
			if(A==0 && 0<k){
				k=k-B;
				B=0;
			}
			
			if(A==0 && B==0 && 0<k ){
				count=count-k;
			}
			
			
			System.out.println(count);
		
	}
}
				
				