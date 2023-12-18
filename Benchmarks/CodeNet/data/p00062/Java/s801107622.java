import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	

	void run(){

		int[] weight = new int[10];

		weight[0] = 1;

		for(int i=0; i<9;i++){

			int[] prev = weight.clone();

			for(int j = 1 ; j < 10;j++){

				weight[j] = prev[j]+prev[j-1];

			}

		}

//		System.out.println(Arrays.toString(weight));

		for(;sc.hasNextLine();){

			String buffer = sc.nextLine();

			int ans = 0;

			for(int i=0; i< 10;i++){

				ans+=weight[i]*(buffer.charAt(i)-'0');

			}

			System.out.println(ans%10);

		}

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

		

	}

}