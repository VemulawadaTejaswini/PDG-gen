import java.util.*; 
import java.lang.*; 

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		long N = scan.nextLong();
		long K = scan.nextLong();
		
		if(N>=K){
		if(N%K==0){
			System.out.println(0);
		}
		else{
			if((K/2.0) >= N%K){
			N = N-K*(N/K);
			System.out.println(N);
			if(N<=0){
				N=N*(-1);
			}
			}
			
			else{
			N = N-(K*((N/K)+1));
			
			if(N<=0){
				N=N*(-1);
			}
			System.out.println(N);
			}
		}
		}
		
		else{
			if(K>=N*2){
				System.out.println(N);
			}
			
			else{
				System.out.println(K-N);
			}
		}
	}
}