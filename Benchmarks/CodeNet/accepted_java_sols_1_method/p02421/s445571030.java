

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//???????????°
		int turns = Integer.parseInt(scan.nextLine());
		//?????¬??????????????????
		int player1 = 0;
		int player2 = 0;
		
		int jad;
		String str = scan.nextLine();
		String[] answer = str.split(" ");
		for (int i = 0; i < turns; i++) {
			jad = answer[0].compareTo(answer[1]);
			if(jad > 0){
				player1 += 3;
			}else if(jad < 0){
				player2 += 3;
			}else{
				player1++;
				player2++;
			}
			if(!(i == (turns - 1))){
				str = scan.nextLine();
				answer = str.split(" ");
			}
		}
		
		System.out.println(player1 + " " + player2);
		
	}

	
}