import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	void run(){

		char in[][] = new char[8][8];

		for(int i= 0;i < 8;i++){

			in[i] = sc.next().toCharArray();

		}

		System.out.println(90);

		for(int i =0 ; i < 8 ; i ++){

			for(int j=0;j < 8 ; j++){

				System.out.print(in[7-j][i]);

			}

			System.out.println();

		}

		System.out.println(180);

		for(int i =0 ; i < 8 ; i ++){

			for(int j=0;j < 8 ; j++){

				System.out.print(in[7-i][7-j]);

			}

			System.out.println();

		}

		System.out.println(270);

		for(int i =0 ; i < 8 ; i ++){

			for(int j=0;j < 8 ; j++){

				System.out.print(in[j][7-i]);

			}

			System.out.println();

		}

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}