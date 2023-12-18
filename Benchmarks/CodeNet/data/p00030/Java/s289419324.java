import java.io.*;

import java.util.*;

import java.math.*;



class Main{

	public static int dfs(int currs, int currd, int j,int n, int s){

		int count = 0;

		int i;

		

		if(currd == n){

			if(currs == s)return 1;

			else return 0;

		}

		

		for(i = Math.min(j,s);i>=0;--i){

			count += dfs(currs+i, currd+1,i-1, n,s);

		}

		return count;	

	

	}

	

	public static void sum_int(ArrayList<Integer> list){

		int n,s,res;

		

		for(int i=0;i<list.size()/2;i++){

			n = list.get(i*2);

			s = list.get(i*2+1);

			if(n == 0 && s == 0)

				break;

				res = dfs(0,0,9,n,s);

				System.out.println(res);

		}

	}

		

	public static void main(String args[]) throws IOException{

		String str;

		ArrayList <Integer> inp = new ArrayList<Integer>();



		Scanner scan = new Scanner(System.in);

		

		while(scan.hasNext()){

			

			str = scan.next();

			int x = Integer.valueOf(str).intValue();

			inp.add(x);

		}

		sum_int(inp);

	}

}