

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static String str;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		str = scan.nextLine();
		//???????????????????????°???dice???????´?
		String[] dice = str.split(" ");
		//?????????????´?????????????
		String[] designate;
		int q = Integer.parseInt(scan.nextLine());
		
		for (int i = 0; i < q; i++) {
			str = scan.nextLine();
			designate = str.split(" ");
			sort(dice, designate);
		}
	}
	

	private static void sort(String[] dice, String[] designate){
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				for (int h = 0; h < 4; h++) {
					String[] direction = new String[i+j+(h*3)];
					String[] dice2 = Arrays.copyOf(dice, dice.length);
					for (int k = 0; k < i; k++) {
						direction[k] = "N";
					}
					for (int l = 0; l < j; l++) {
						direction[i+l] = "E";
					}
					for (int f = 0; f < h; f++) {
						int num = f * 3;
						direction[i+j+num] = "W";
						direction[i+j+(num+1)] = "S";
						direction[i+j+(num+2)] = "E";
					}
				
					move(dice2, direction);
					
					
					if(dice2[0].equals(designate[0]) && dice2[1].equals(designate[1])){
						System.out.println(dice2[2]);
						return;
					}
				}
				}
				
		}
	}
	
	/**
	 * move
	 * ???????????????????????°???????????????
	 * @param dice
	 * @param designate
	 * @return dice[2] (????????????????????´?????????)
	 */
	private static String[] move(String[] dice, String[] direction) {
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
		return dice;		
	}
}