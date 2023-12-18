

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final int COUNT = 4;
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] dice = str.split(" ");
		str = scan.nextLine();
		String[] direction = str.split("");
		
		//??±=>E, ?\?=>W, ???=>S, ???=>N
		for (int i = 0; i < direction.length; i++) {
			if(direction[i].equals("E")){
				str = dice[0];
				dice[0] = dice[3];
				dice[3] = dice[5];
				dice[5] = dice[2];
				dice[2] = str;
			}else if(direction[i].equals("W")){
				str = dice[0];
				dice[0] = dice[2];
				dice[2] = dice[5];
				dice[5] = dice[3];
				dice[3] = str;
			}else if(direction[i].equals("S")){
				str = dice[0];
				dice[0] = dice[4];
				dice[4] = dice[5];
				dice[5] = dice[1];
				dice[1] = str;
			}else if(direction[i].equals("N")){
				str = dice[0];
				dice[0] = dice[1];
				dice[1] = dice[5];
				dice[5] = dice[4];
				dice[4] = str;
			}
		}
		System.out.println(dice[0]);
		
	}
}