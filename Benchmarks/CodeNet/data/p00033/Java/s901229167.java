import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	void run(){ //greedy

		int n = sc.nextInt();

		for(int i= 0 ; i < n; i++){

			int val = 0;

			int val2 = 0;

			boolean ans = true;

			for(int j=0;j <10; j++){

				int ball = sc.nextInt();

				if(ball > val){

					val = ball;

				}

				else if(ball > val2){

					val2 = ball;

				}else{

					ans = false;

				}

			}	

			System.out.println(ans?"YES":"NO");

		}

		

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

		

	}

}