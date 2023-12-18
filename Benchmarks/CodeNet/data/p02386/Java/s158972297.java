import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[][] dice,tmp_dice2;
		int[] tmp_dice;
		dice = new int[100][10];
		tmp_dice2 = new int[100][10];
		tmp_dice = new int[10];
		int i,m,k;
		int n = scan.nextInt();
		
		for(i = 0; i < n; i++){
			for(m = 0; m < 6; m++){
				dice[n][m] = scan.nextInt();
				tmp_dice2[n][m] = dice[n][m];
			}
		}
		
		for(i = 0; i < n; i++){
				for(m = 0; m < 4; m++){
					if(dice[n][0] == dice[n + 1][0] && dice[n][1] == dice[n + 1][1] &&
							dice[n][2] == dice[n + 1][2] && dice[n][3] == dice[n + 1][3] &&
							dice[n][4] == dice[n + 1][4] && dice[n][5] == dice[n + 1][5])
						break;
					tmp_dice[0] = dice[i][4];
					tmp_dice[1] = dice[i][0];
					tmp_dice[2] = dice[i][2];
					tmp_dice[3] = dice[i][3];
					tmp_dice[4] = dice[i][5];
					tmp_dice[5] = dice[i][1];
					dice[i][0] = tmp_dice[0];
					dice[i][1] = tmp_dice[1];
					dice[i][2] = tmp_dice[2];
					dice[i][3] = tmp_dice[3];
					dice[i][4] = tmp_dice[4];
					dice[i][5] = tmp_dice[5];
					for(k = 0; k < 4; k++){
						if(dice[n][0] == dice[n + 1][0] && dice[n][1] == dice[n + 1][1] &&
								dice[n][2] == dice[n + 1][2] && dice[n][3] == dice[n + 1][3] &&
								dice[n][4] == dice[n + 1][4] && dice[n][5] == dice[n + 1][5])
							break;
						tmp_dice[0] = dice[i][0];
						tmp_dice[1] = dice[i][3];
						tmp_dice[2] = dice[i][1];
						tmp_dice[3] = dice[i][4];
						tmp_dice[4] = dice[i][2];
						tmp_dice[5] = dice[i][5];
						dice[i][0] = tmp_dice[0];
						dice[i][1] = tmp_dice[1];
						dice[i][2] = tmp_dice[2];
						dice[i][3] = tmp_dice[3];
						dice[i][4] = tmp_dice[4];
						dice[i][5] = tmp_dice[5];
					}
				}
				if(dice[n][0] == dice[n + 1][0] && dice[n][1] == dice[n + 1][1] &&
						dice[n][2] == dice[n + 1][2] && dice[n][3] == dice[n + 1][3] &&
						dice[n][4] == dice[n + 1][4] && dice[n][5] == dice[n + 1][5]){
					
				}
				else{
					dice[i][0] = tmp_dice2[i][0];
					dice[i][1] = tmp_dice2[i][1];
					dice[i][2] = tmp_dice2[i][2];
					dice[i][3] = tmp_dice2[i][3];
					dice[i][4] = tmp_dice2[i][4];
					dice[i][5] = tmp_dice2[i][5];
				}
				for(m = 0; m < 4; m++){
					if(dice[n][0] == dice[n + 1][0] && dice[n][1] == dice[n + 1][1] &&
							dice[n][2] == dice[n + 1][2] && dice[n][3] == dice[n + 1][3] &&
							dice[n][4] == dice[n + 1][4] && dice[n][5] == dice[n + 1][5])
						break;
					tmp_dice[0] = dice[i][3];
					tmp_dice[1] = dice[i][1];
					tmp_dice[2] = dice[i][0];
					tmp_dice[3] = dice[i][5];
					tmp_dice[4] = dice[i][4];
					tmp_dice[5] = dice[i][2];
					dice[i][0] = tmp_dice[0];
					dice[i][1] = tmp_dice[1];
					dice[i][2] = tmp_dice[2];
					dice[i][3] = tmp_dice[3];
					dice[i][4] = tmp_dice[4];
					dice[i][5] = tmp_dice[5];
					for(k = 0; k < 4; k++){
						if(dice[n][0] == dice[n + 1][0] && dice[n][1] == dice[n + 1][1] &&
								dice[n][2] == dice[n + 1][2] && dice[n][3] == dice[n + 1][3] &&
								dice[n][4] == dice[n + 1][4] && dice[n][5] == dice[n + 1][5])
							break;
						tmp_dice[0] = dice[i][0];
						tmp_dice[1] = dice[i][3];
						tmp_dice[2] = dice[i][1];
						tmp_dice[3] = dice[i][4];
						tmp_dice[4] = dice[i][2];
						tmp_dice[5] = dice[i][5];
						dice[i][0] = tmp_dice[0];
						dice[i][1] = tmp_dice[1];
						dice[i][2] = tmp_dice[2];
						dice[i][3] = tmp_dice[3];
						dice[i][4] = tmp_dice[4];
						dice[i][5] = tmp_dice[5];
					}
				}
				if(dice[n][0] == dice[n + 1][0] && dice[n][1] == dice[n + 1][1] &&
						dice[n][2] == dice[n + 1][2] && dice[n][3] == dice[n + 1][3] &&
						dice[n][4] == dice[n + 1][4] && dice[n][5] == dice[n + 1][5]){}
				else{
					System.out.println("No");
					break;
				}
				
		}
		if(dice[n][0] == dice[n + 1][0] && dice[n][1] == dice[n + 1][1] &&
				dice[n][2] == dice[n + 1][2] && dice[n][3] == dice[n + 1][3] &&
				dice[n][4] == dice[n + 1][4] && dice[n][5] == dice[n + 1][5])
			System.out.println("Yes");
	}
}