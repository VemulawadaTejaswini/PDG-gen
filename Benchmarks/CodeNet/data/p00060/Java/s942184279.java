import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	void run(){

		for(;sc.hasNextInt();){

			int[] data = new int[3];

			boolean[] used = new boolean[11];

			used[0] = true;

			for(int i=0; i < 3;i++){

				data[i] =sc.nextInt();

				used[data[i]] = true;

			}

			int sum = 0;

			for(int l=0; l <= 10;l++){

				if(used[l]) continue;

				if(data[0]+data[1]+l <= 20) sum++; 

			}

			System.out.println(sum>3.5?"YES":"NO");

		}

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

		

	}

}