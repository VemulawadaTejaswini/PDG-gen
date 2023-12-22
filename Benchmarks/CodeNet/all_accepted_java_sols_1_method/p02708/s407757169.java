import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			long MOD = (long)1e9+7;
			
			long N = scan.nextLong();
			long K = scan.nextLong();
			
			long goukei = 0;
			
			for(long i = K;i<=N+1;i++) {
				
				long sento = i*(i-1)/2;
				long kouho = N*(N+1)/2-(N-i)*(N-i+1)/2;
				long touri = kouho-sento+1;
				/*System.out.print(sento);
				System.out.print(" ");
				System.out.print(kouho);
				System.out.print(" ");
				System.out.println(touri);*/
				
				goukei = (goukei+touri)%MOD;
				
				
			}
			
			
			System.out.println(goukei);
			
			
			
			
		}
		
		
	}
		

}