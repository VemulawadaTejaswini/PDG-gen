import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] dice1,dice2,dice3,dice4;
		dice1 = new int[10];
		dice2 = new int[10];
		dice3 = new int[10];
		dice4 = new int[10];
		int i,m;
		for(i = 0; i < 6; i++){
			dice1[i] = scan.nextInt();
		}
		
		for(i = 0; i < 6; i++){
			dice2[i] = scan.nextInt();
			dice4[i] = dice2[i];
		}
		
		for(i = 0; i < 4; i++){
			if(dice1[0] == dice2[0] && dice1[1] == dice2[1] &&
					dice1[2] == dice2[2] && dice1[3] == dice2[3] &&
							dice1[4] == dice2[4] && dice1[4] == dice2[4])
				break;
			dice3[0] = dice2[3];
			dice3[1] = dice2[1];
			dice3[2] = dice2[0];
			dice3[3] = dice2[5];
			dice3[4] = dice2[4];
			dice3[5] = dice2[2];
			dice2[0] = dice3[0];
			dice2[1] = dice3[1];
			dice2[2] = dice3[2];
			dice2[3] = dice3[3];
			dice2[4] = dice3[4];
			dice2[5] = dice3[5];
				for(m = 0; m < 4; m++){
					if(dice1[0] == dice2[0] && dice1[1] == dice2[1] &&
							dice1[2] == dice2[2] && dice1[3] == dice2[3] &&
									dice1[4] == dice2[4] && dice1[4] == dice2[4])
						break;
				dice3[0] = dice2[0];
				dice3[1] = dice2[3];
				dice3[2] = dice2[1];
				dice3[3] = dice2[4];
				dice3[4] = dice2[2];
				dice3[5] = dice2[5];
				dice2[0] = dice3[0];
				dice2[1] = dice3[1];
				dice2[2] = dice3[2];
				dice2[3] = dice3[3];
				dice2[4] = dice3[4];
				dice2[5] = dice3[5];
					}
				}
		
		for(i = 0; i < 4; i++){
			if(dice1[0] == dice2[0] && dice1[1] == dice2[1] &&
					dice1[2] == dice2[2] && dice1[3] == dice2[3] &&
							dice1[4] == dice2[4] && dice1[5] == dice2[5]){
				System.out.println("Yes");
				break;
			}
			dice3[0] = dice2[3];
			dice3[1] = dice2[1];
			dice3[2] = dice2[0];
			dice3[3] = dice2[5];
			dice3[4] = dice2[4];
			dice3[5] = dice2[2];
			dice2[0] = dice3[0];
			dice2[1] = dice3[1];
			dice2[2] = dice3[2];
			dice2[3] = dice3[3];
			dice2[4] = dice3[4];
			dice2[5] = dice3[5];
				for(m = 0; m < 4; m++){
					if(dice1[0] == dice2[0] && dice1[1] == dice2[1] &&
							dice1[2] == dice2[2] && dice1[3] == dice2[3] &&
									dice1[4] == dice2[4] && dice1[4] == dice2[4])
						break;
				dice3[0] = dice2[0];
				dice3[1] = dice2[3];
				dice3[2] = dice2[1];
				dice3[3] = dice2[4];
				dice3[4] = dice2[2];
				dice3[5] = dice2[5];
				dice2[0] = dice3[0];
				dice2[1] = dice3[1];
				dice2[2] = dice3[2];
				dice2[3] = dice3[3];
				dice2[4] = dice3[4];
				dice2[5] = dice3[5];
				}
		}
		
	}
}