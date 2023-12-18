import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int[] dice_number = new int[6];

		for(int side_number = 0; side_number < 6; side_number++) {

			dice_number[side_number] = in.nextInt();

		}

		int question_num = in.nextInt();

		for(int i = 0; i < question_num; i++) {

			dice dice = new dice(dice_number);

			int top_num = in.nextInt();
			int front_num = in.nextInt();

			dice.dice_position(top_num, front_num);

			dice_number = dice.getDice_number();
			System.out.println(dice_number[2]);

		}
	}
}



class dice{

	int[] dice_number;

	// ?????????????????????
	dice(int[] dice_number){

		this.dice_number = dice_number;

	}

	// ????????????
	public int[] getDice_number() {
		return dice_number;
	}

	// ????????????
	public void setDice_number(int[] dice_number) {
		this.dice_number = dice_number;
	}

	// ?????????????????¢??????????????????
	void roll(char roll_direction){

		int tmp;

		switch(roll_direction){

		// ?????????????????¢??????
		case 'S':

			tmp = dice_number[0];
			dice_number[0] = dice_number[4];
			dice_number[4] = dice_number[5];
			dice_number[5] = dice_number[1];
			dice_number[1] = tmp;

			break;

		// ?\\???????????¢??????
		case 'N':

			tmp = dice_number[0];
			dice_number[0] = dice_number[1];
			dice_number[1] = dice_number[5];
			dice_number[5] = dice_number[4];
			dice_number[4] = tmp;

			break;

		// ??????????????¢??????
		case 'W':

			tmp = dice_number[0];
			dice_number[0] = dice_number[2];
			dice_number[2] = dice_number[5];
			dice_number[5] = dice_number[3];
			dice_number[3] = tmp;

			break;

		// ??????????????¢??????

		case 'E':

			tmp = dice_number[0];
			dice_number[0] = dice_number[3];
			dice_number[3] = dice_number[5];
			dice_number[5] = dice_number[2];
			dice_number[2] = tmp;

			break;

		}
	}

	// ?????????????????????????????¢?????????????????????
	void turn(char turn_direction) {

		int tmp;

		switch(turn_direction) {

		// ????????¢
		case 'R':

			tmp = dice_number[1];
			dice_number[1] = dice_number[3];
			dice_number[3] = dice_number[4];
			dice_number[4] = dice_number[2];
			dice_number[2]= tmp;

			break;

		// ????????¢
		case 'L':

			tmp = dice_number[1];
			dice_number[1] = dice_number[2];
			dice_number[2] = dice_number[4];
			dice_number[4] = dice_number[3];
			dice_number[3] = tmp;

			break;

		}
	}

	void dice_position(int top_num, int front_num) {

		if(top_num != dice_number[0]) {

			for(int i = 0; i < 3; i++) {

				roll('S');

				if(top_num == dice_number[0]) {

					break;

				}else{

					roll('E');

					if(top_num == dice_number[0]) {

						break;

					}
				}
			}
		}

		if(front_num != dice_number[1]) {

			for(int i = 0; i < 3; i++) {

				turn('R');

				if(front_num == dice_number[1]) {

					break;

				}
			}
		}
	}
}