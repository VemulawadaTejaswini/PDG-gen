

import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	String[][] chm = {

			{"a","b","c","d","e"},

			{"f","g","h","i","j"},

			{"k","l","m","n","o"},

			{"p","q","r","s","t"},

			{"u","v","w","x","y"},

			{"z",".","?","!"," "},			

	};

	

	class data{

		int r;

		int c;

		boolean ng = false;

		data(int r,int c){

			this.r = r-1;

			this.c = c-1;

			ng = !(this.r < 6 && this.c < 5);

		}

		@Override

		public String toString() {	

			return chm[r][c];

		}

	}

	void run(){

		for(;sc.hasNext();){

			String message = sc.next();

			char[] buffer = message.toCharArray();

			int n = buffer.length;

			if((n&1)==1){

				System.out.println("NA");

				continue;

			}

			data[] d =new data[n/2];

			boolean f = false;

			for(int i = 0; i < n;i+=2){

				d[i/2] = new data(buffer[i]-'0',buffer[i+1]-'0');

				f = f||d[i/2].ng;

			}

			if(f){

				System.out.println("NA");

				continue;

			}

			for(int i = 0; i < n/2;i++){

				System.out.print(d[i]);

			}

			System.out.println();

		}

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}