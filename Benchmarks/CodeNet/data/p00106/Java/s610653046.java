

import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	void run(){

		int[] dp = new int[51];

		Arrays.fill(dp, Integer.MAX_VALUE - 3000);

		dp[0] = 0;

		int price[] ={380,550,850,380*4,(int)(550*4*0.85 + 0.4),(int)(850*3*0.88 + 0.4)} ;

		int weigh[] ={  2,  3,  5, 10,12,15} ;

		for(int i = 0;i < 6;i++){

			for(int j=0;weigh[i]+j < 51;j++){

				dp[j+weigh[i]] = Math.min(dp[j] + price[i],dp[j+weigh[i]]);

			}

		}

		for(;;){

			int n = sc.nextInt()/100;

			if(n==0) break;

			System.out.println(dp[n]);

		}

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}