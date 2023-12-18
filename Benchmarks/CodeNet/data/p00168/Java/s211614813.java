import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		int dp[ ] = new int[31];
		dp[0] = 1;
		
		for(int i = 0; i < 31;i++){
			for(int ni = i-3; ni < i; ni++){
				if(ni < 0){
					continue;
				}
				dp[i] += dp[ni];
			}
		}
		
		
		for(;;){
			int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			System.out.println(((dp[n]-1)/3650) + 1);
			
		}
		
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
}