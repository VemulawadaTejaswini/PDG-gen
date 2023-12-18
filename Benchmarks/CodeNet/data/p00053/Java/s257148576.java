

import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	void run(){

		boolean[] np = new boolean[500001];

		np[0] = np[1] = true;

		for(int i=0; i< 500001;i++){

			if(np[i]) continue;

			for(int j = i*2; j < 500001; j += i){

				np[j] = true;

			}

		}

		int[] ans = new int[10001];

		int sum=0;

		int j = 0;

		for(int i=0; j<10000;i++){

			if(!np[i]){

				sum+=i;

				j++;

				ans[j] = sum;

			}

		}

		for(;;){

			int n = sc.nextInt();

			if(n==0){

				break;

			}

			System.out.println(ans[n]);

		}

		

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

		

	}

}