import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	void run(){

		boolean[] np=new boolean[50001];

		np[0]=np[1]=true;

		for(int i = 0; i < 50001;i++){

			if(np[i]) continue;

			for(int j=i*2;j<50001;j+=i){

				np[j] = true;

			}

		}

		int[] dp = new int[50001];

		for(int i=0;i<50001;i++){

			if(np[i]) continue;

			for(int j=i;i+j<50001;j++){

				if(np[j])continue;

				dp[i+j]++;

			}

		}

		for(;;){

			int n = sc.nextInt();

			if(n==0) break;

			System.out.println(dp[n]);

		}

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}