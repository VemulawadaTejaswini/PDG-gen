import java.util.Scanner;

public class Main{
	static long mod = (long)1e9+7;
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			
			int N = scan.nextInt();
			int M = scan.nextInt();
			long ans = 0;
			long Npow = N;
			long Mpow = M;
			
			for(int i =N-1;i>0;i--) {
				Npow = i*Npow%mod;
				//System.out.println(Npow);
			}
			for(int i =M-1;i>0;i--) {
				Mpow = i*Mpow%mod;
			}
			
			//System.out.println(Npow);
			//System.out.println(Mpow);
			if(Math.abs(N-M)==1) {
				
				ans+=Npow*Mpow%mod;
				System.out.println(ans);
				
			}else if(N==M){	
				ans+=(Npow*Mpow%mod)*2%mod;
				System.out.println(ans);
				
			}else{
				System.out.println(0);
			}
			

		}
		
		
	}
	
	
		

}
