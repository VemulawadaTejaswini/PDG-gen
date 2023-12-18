import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String fst = br.readLine();
		Dice dice = new Dice(fst);
		dice.sim(br.readLine());
		System.out.println(dice.getTop());
	}
}


class Dice{
	private int top;
	private int forth;
	private int right;
	private int left;
	private int back;
	private int bottom;
	Dice(String str){
		String[] s = str.split(" ");	
		top = Integer.parseInt(s[0]);
		forth = Integer.parseInt(s[1]);
		right = Integer.parseInt(s[2]);
		left = Integer.parseInt(s[3]);
		back = Integer.parseInt(s[4]);
		bottom = Integer.parseInt(s[5]);
	}

	public void sim(String st){
		int work;
		for (int i = 0; i<st.length() ; i++ ) {
			switch(st.charAt(i)){

				case 'N':
				work = top;
				top = forth;
				forth = bottom;
				bottom = back;
				back = work;
				break;

				case 'E':
				work = top;
				top = left;
				left = bottom;
				bottom = right;
				right = work;
				break;

				case 'S':
				work = top;
				top = back;
				back = bottom;
				bottom = forth;
				forth = work;
				break;

				case 'W':
				work = top;
				top = right;
				right = bottom;
				bottom = left;
				left = work;
				break;

			}
		}

	}
	public int getTop(){
		return top;
	}
}