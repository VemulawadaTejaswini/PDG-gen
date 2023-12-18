//package _0138;



import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	class data implements Comparable<data>{

		int no;

		double time;

		data(int no,double time){

			this.no = no;

			this.time = time;

		}

		

		public int compareTo(data o) {

			return (this.time - o.time)>0?1:-1;

		}

		

		public String toString() {

			return no+" "+time;

		}

	}

	void run(){

		data[][] in = new data[3][8];

		for(int i = 0 ; i < 24;i++){

			in[i/8][i%8] = new data(sc.nextInt(),sc.nextDouble());

		}

		for(int i = 0; i < 3 ;i ++){

			Arrays.sort(in[i]);

		}

		for(int i = 0; i < 3; i++){

			System.out.println(in[i][0]);

			System.out.println(in[i][1]);

		}

		data[] cand =  new data[6];

		int z = 0;

		for(int i =0 ; i<3;i++){

			for(int j = 2; j<=3; j++){

				cand[z++] = in[i][j];

			}

		}

		Arrays.sort(cand);

		System.out.println(cand[0]);

		System.out.println(cand[1]);

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}