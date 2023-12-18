

import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	void run(){

		for(;;){

			int n = sc.nextInt();

			if(n==0) break;

			int a = 0;

			int b = 0;

			for(int i =0 ; i < n; i++){

				int a1 = sc.nextInt();

				int b1 = sc.nextInt();

				if(a1 > b1){

					a+=a1 + b1;

				}

				if(b1 > a1){

					b+= a1+b1;

				}

				if(a1 == b1){

					a += a1;

					b += b1;

				}

			}

			System.out.println(a + " "+ b);

		}		

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}