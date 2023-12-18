import java.util.Scanner;


public class Main {

	static Scanner sc;
	static int num;
	static int dp[] = new int[31];
	
	public static void main(String[] args) {
		
		dp[1]=1;
		dp[2]=2;
		dp[3]=4;
		
		for(int i=4; i<=30; i++){
			dp[i]=dp[i-1] + dp[i-2] + dp[i-3];
		}
		
		sc = new Scanner(System.in);
		
		new Main();
	}
	
	Main(){
		
		while (sc.hasNext()) {
			
			num = sc.nextInt();;
			
			if(num==0) break;
			
			System.out.println((dp[num]/3650)+1);
		}	
	}
}