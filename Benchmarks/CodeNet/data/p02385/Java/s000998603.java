import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Dice dice1 = new Dice(br.readLine());
		Dice dice2 = new Dice(br.readLine());
		while(true){
			if (dice1.getTop() == dice2.getTop()) {

			}else if (dice1.getTop() == dice2.getForth()){
				dice2.sim("N");
			}else if (dice1.getTop() == dice2.getRight()){
				dice2.sim("W");
			}else if (dice1.getTop() == dice2.getBack()){
				dice2.sim("S");
			}else if (dice1.getTop() == dice2.getLeft()){
				dice2.sim("E");
			}else if (dice1.getTop() == dice2.getBottom()){
				dice2.sim("NN");
			}else{
				System.out.println("No");
				break;
			}

			if (dice1.getForth() == dice2.getForth()) {
				
			}else if(dice1.getForth() == dice2.getRight()){
				dice2.sim("WSE");
			}else if(dice1.getForth() == dice2.getBack()){
				dice2.sim("WSSE");
			}else if(dice1.getForth() == dice2.getLeft()){
				dice2.sim("ESW");
			}else{
				System.out.println("No");
				break;
			}

			if (dice1.getTop() == dice2.getTop() && dice1.getForth() == dice2.getForth() && dice1.getRight() == dice2.getRight() && dice1.getLeft() == dice2.getLeft() && dice1.getBack() == dice2.getBack() && dice1.getBottom() == dice2.getBottom()){
				System.out.println("Yes");
				break;
			}else{
				System.out.println("No");
				break;
			}

		}
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
	public int getForth(){
		return forth;
	}

	public int getRight(){
		return right;
	}
	public int getLeft(){
		return left;
	}
	public int getBack(){
		return back;
	}
	public int getBottom(){
		return bottom;
	}
}