

import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	int dp[] = {0,1,2,3,4,5,6,7,8,9,5,4,3,2,1,0,1,2,3,4,5,6,7,8,9,5,4,3,2,1};

	void run(){

		int n = sc.nextInt();

		for(int i = 0; i < n ; i++){

			int start = sc.nextInt();

			int end = sc.nextInt();

			String ans1 = "";

			boolean trig1 = false;

			for(int j = 0; j < dp.length; j++){

				if(dp[j] == start){

					ans1 = "";

					trig1 = true;

				}

				if(trig1){

					ans1+=dp[j]+" ";

				}

				if(trig1&&dp[j] == end){

					trig1 = false;

					break;

				}

			}

			System.out.println(ans1.trim());

		}

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}