

import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	int next4Rand(int seed){

		return ((seed*seed)/100)%10000;

	}

	void run(){

		int n = sc.nextInt();

		for(int i =0; i< n; i++){

			System.out.println("Case "+(i+1)+":");

			int seed  = sc.nextInt();

			for(int j =0 ; j < 10;j++){

				seed = next4Rand(seed);

				System.out.println(seed);

			}

		}

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}