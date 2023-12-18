import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	class E{

		int key;

		int value;

		E(int k,int v){

			key = k;

			value = v;

		}

	}

	void run(){

		boolean[] solved = new boolean[31];

		HashMap<Integer, Integer> l = new HashMap<Integer, Integer>();

		for(;;){

			String buffer = sc.nextLine();

			Scanner in = new Scanner(buffer.replace(',',' '));

			int n = in.nextInt();

			int s = in.nextInt();

			if((n|s)==0) break;

			solved[s] = true;	

			l.put(n, s);

		}

		int[] rank = new int[31];

		int r=0;

		for(int i=0;i < 31;i++){

			if(solved[30-i]){

				r++;

			}

			rank[30-i]=r;

		}

		for(;sc.hasNextLine();){

			String buffer = sc.nextLine();

			Scanner in = new Scanner(buffer.replace(',',' '));

			int n = in.nextInt();

			int value = 0;

			value = l.get(n);

			System.out.println(rank[value]);

		}

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}