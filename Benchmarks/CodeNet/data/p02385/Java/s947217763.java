import java.util.Arrays;
import java.util.Scanner; 

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 Dice2 di = new Dice2();

		int[] dice = new int[6];		//dice
		for(int i=0; i<6; i++) {
			 dice[i] = scan.nextInt();
			}
		
		int[] dice2 = new int[6];		//dice2

		for(int i=0; i<6; i++) {
			 dice2[i] = scan.nextInt();
			}

        int answer[] = new int[6];	//同じサイコロの形

        //N方向回転
		for(int i=0; i<4; i++) {

			if(Arrays.equals(dice, answer)) {
				break;
			}
			answer = di.command(dice2, 'N');

			//横回転
			for(int j=0; j<4; j++) {

				if(Arrays.equals(dice, answer)) {
					break;
				}
				answer = di.command(dice2, 'R');
			}
		}

		//W方向回転
		for(int i=0; i<4; i++) {

			if(Arrays.equals(dice, answer)){
				break;
			}
			answer = di.command(dice2, 'W');

			//横回転
			for(int j=0; j<4; j++) {

				if(Arrays.equals(dice, answer)) {
					break;
				}
				answer = di.command(dice2, 'R');

			}
		}
		
		//出力
		if(Arrays.equals(dice, answer)) {
			System.out.println("Yes");
		}else
			System.out.println("No");
	}
}

class Dice2{

	int[] command(int[] dice, char com) {
	    	int top = dice[0];	//dice[0]を覚えておく
	    	int side1 = dice[1];	//dice[1]を覚えておく

	    	switch (com) {

	    	case 'N':
	    		dice[0] = dice[1];
	    		dice[1] = dice[5];
	    		dice[5] = dice[4];
	    		dice[4] = top;
	    		break;

	    	case 'W':
	    		dice[0] = dice[2];
	    		dice[2] = dice[5];
	    		dice[5] = dice[3];
	    		dice[3] = top;
	    		break;


	    	case 'R':
	    		dice[1] = dice[3];
	    		dice[3] = dice[4];
	    		dice[4] = dice[2];
	    		dice[2] = side1;
	    		break;
	    	}
		return dice; 		//配列を返す
	 }
}

