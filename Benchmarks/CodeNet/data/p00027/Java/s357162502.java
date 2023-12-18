import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		int[] map={31,29,31,30,31,30,31,31,30,31,30,31};
		int[] dp = new int [12];
		String[] str ={
				"Monday",
				"Tuesday",
				"Wednesday",
				"Thursday",
				"Friday",
				"Saturday",
				"Sunday",
		};
		dp[0] = 2;
		for(int i=1; i <12;i++){
			dp[i] = (dp[i-1] + map[i-1] )%7;
		}
		for(;;){
			int m = sc.nextInt();
			
			int n = sc.nextInt();
			if((m|n)==0){
				break;
			}
			System.out.println(str[(dp[m-1]+n)%7]);
		}
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
}