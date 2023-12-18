import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	void run(){

		for(;sc.hasNextLong();){

			long n = sc.nextLong();

			if(n==0) break;

			int sum = 0;

			for(n/=5;n>0;n/=5){

				sum+=n;

			}

			System.out.println(sum);

		}

		

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

}

}