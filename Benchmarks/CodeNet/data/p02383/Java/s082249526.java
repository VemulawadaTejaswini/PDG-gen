package main;
import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
//		System.out.println(" ");
		Scanner scan = new Scanner(System.in);
		int num[] = new int[6];
		int answer = 0;
		String dec = "";
		diceClass dice =new diceClass();

		for (int i=0;i<6;i++){
			num[i] = scan.nextInt();
			dice.pos[i] = num[i];
			System.out.println(num[i]);
		}
		dec = scan.next();
		char[] decChar = dec.toCharArray();
		for(int i=0;i<dec.length();i++){
			answer = dice.move(decChar[i]);
		}

		System.out.println(answer);
	}
}


class diceClass{	//?????????????????¢?????????????????´?????????
	int pos[] = new int[6];

	public void diceClass(){

	}
	
	public int move(char direction){
		int[] temp = (int[])pos.clone();
		if(direction == 'N'){
			pos[0] = temp[1];
			pos[1] = temp[5];
			pos[2] = temp[2];
			pos[3] = temp[3];
			pos[4] = temp[0];
			pos[5] = temp[4];
		}
		else if(direction == 'E'){
			pos[0] = temp[3];
			pos[1] = temp[1];
			pos[2] = temp[0];
			pos[3] = temp[5];
			pos[4] = temp[4];
			pos[5] = temp[2];
		}
		else if(direction == 'W'){
			pos[0] = temp[2];
			pos[1] = temp[1];
			pos[2] = temp[5];
			pos[3] = temp[0];
			pos[4] = temp[4];
			pos[5] = temp[3];
		}
		else if(direction == 'S'){
			pos[0] = temp[4];
			pos[1] = temp[0];
			pos[2] = temp[2];
			pos[3] = temp[3];
			pos[4] = temp[5];
			pos[5] = temp[1];
		}
		return pos[0];
	}
}