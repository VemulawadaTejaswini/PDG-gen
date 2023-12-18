import java.io.*;
import java.util.*;


public class Main{ 

	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		Dice d = new Dice(scan.nextLine());
		int qnum = scan.nextInt();
		for(int i=0; i< qnum;i++){
			d.rollSet(scan.nextInt(),scan.nextInt());
		}

	}

}
class Dice{
	int top;
	int back;
	int right;
	int left;
	int front;
	int bottom;
	public Dice(String line){
		String[] face = line.split(" ");
		top = Integer.parseInt(face[0]);
		back = Integer.parseInt(face[1]);
		right = Integer.parseInt(face[2]);		
		left = Integer.parseInt(face[3]);
		front = Integer.parseInt(face[4]);
		bottom = Integer.parseInt(face[5]);
	}
	void rotate(){
		int tmp = front;
		front = right;
		right=back;
		back = left;
		left = tmp;
	}
	public void roll(char c){
		int tmp = top;
		switch(c){
			case 'N':
				top = back;
				back=bottom;
				bottom = front;
				front = tmp;
				break;
			case 'E':
				top = left;
				left = bottom;
				bottom = right;
				right = tmp;
				break;
			case 'S':
				top = front;
				front = bottom;
				bottom = back;
				back = tmp;
				break;
			case 'W':
				top = right;
				right = bottom;
				bottom = left;
				left = tmp;
				break;
		}
	}
	public void printTop(){
		System.out.println(this.top);
	}
	public void rollSet(int t, int b){
		if(!frontRoll(t)){
			while(top!=t)
				roll('W');
		}
		while(back!=b)
				rotate();
		System.out.println(this.right);
	}
	boolean frontRoll(int t){
		for(int i=0;i<4;i++){
			roll('N');
			if(top==t)
				return true;
		}
		return false;
	}

}