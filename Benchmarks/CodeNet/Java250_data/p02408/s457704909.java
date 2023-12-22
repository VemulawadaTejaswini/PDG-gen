

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 52????????????????????????
		int[][] cards = new int[4][13];

		Scanner in = new Scanner(System.in);
		int all_num = in.nextInt();

		for(int i = 0; i < all_num; i++){

			String mark = in.next();
			int num = in.nextInt();

			switch(mark) {

			case "S":

				cards[0][num - 1] = 1;

				break;

			case "H":

				cards[1][num - 1] = 1;

				break;

			case "C":

				cards[2][num - 1] = 1;

				break;

			case "D":

				cards[3][num - 1] = 1;

				break;

			}
		}

		// ????????¨?????????????????????????????????
		char[] marks = {'S', 'H', 'C', 'D'};

		// ???????????????????????§?¶????????????????????????????
		for(int i = 0; i < 4; i++) {

			for(int j = 0; j < 13; j++) {

				if(cards[i][j] == 0){

					System.out.println(marks[i] + " " + (j + 1));

				}
			}
		}
	}
}


//=======================??´?????´????????????================================

		/*// 52???????????????????´?????????????
		int[][] cards = new int[4][13];
		// ????????????????????????????´?????????????
		int[][] has_cards = new int[4][13];

		// 52???????????????????????????????´?
		for(int m = 0; m < 4; m++){

			for(int i = 0; i < 13; i++){

				cards[m][i] = i + 1;
			}
		}


		Scanner in = new Scanner(System.in);
		int all_num = in.nextInt();

		// ?????????????????????????????????????´?
		for(int i = 0; i < all_num; i++){

			String mark = in.next();
			int num = in.nextInt();

			if(mark.equals("S")){
				if(num == 1){
					has_cards[0][0] = 1;
				}else if(num == 2){
					has_cards[0][1] = 2;
				}else if(num == 3){
					has_cards[0][2] = 3;
				}else if(num == 4){
					has_cards[0][3] = 4;
				}else if(num == 5){
					has_cards[0][4] = 5;
				}else if(num == 6){
					has_cards[0][5] = 6;
				}else if(num == 7){
					has_cards[0][6] = 7;
				}else if(num == 8){
					has_cards[0][7] = 8;
				}else if(num == 9){
					has_cards[0][8] = 9;
				}else if(num == 10){
					has_cards[0][9] = 10;
				}else if(num == 11){
					has_cards[0][10] = 11;
				}else if(num == 12){
					has_cards[0][11] = 12;
				}else if(num == 13){
					has_cards[0][12] = 13;
				}
			}else if(mark.equals("H")){
				if(num == 1){
					has_cards[1][0] = 1;
				}else if(num == 2){
					has_cards[1][1] = 2;
				}else if(num == 3){
					has_cards[1][2] = 3;
				}else if(num == 4){
					has_cards[1][3] = 4;
				}else if(num == 5){
					has_cards[1][4] = 5;
				}else if(num == 6){
					has_cards[1][5] = 6;
				}else if(num == 7){
					has_cards[1][6] = 7;
				}else if(num == 8){
					has_cards[1][7] = 8;
				}else if(num == 9){
					has_cards[1][8] = 9;
				}else if(num == 10){
					has_cards[1][9] = 10;
				}else if(num == 11){
					has_cards[1][10] = 11;
				}else if(num == 12){
					has_cards[1][11] = 12;
				}else if(num == 13){
					has_cards[1][12] = 13;
				}
			}else if(mark.equals("C")){
				if(num == 1){
					has_cards[2][0] = 1;
				}else if(num == 2){
					has_cards[2][1] = 2;
				}else if(num == 3){
					has_cards[2][2] = 3;
				}else if(num == 4){
					has_cards[2][3] = 4;
				}else if(num == 5){
					has_cards[2][4] = 5;
				}else if(num == 6){
					has_cards[2][5] = 6;
				}else if(num == 7){
					has_cards[2][6] = 7;
				}else if(num == 8){
					has_cards[2][7] = 8;
				}else if(num == 9){
					has_cards[2][8] = 9;
				}else if(num == 10){
					has_cards[2][9] = 10;
				}else if(num == 11){
					has_cards[2][10] = 11;
				}else if(num == 12){
					has_cards[2][11] = 12;
				}else if(num == 13){
					has_cards[2][12] = 13;
				}
			}else if(mark.equals("D")){
				if(num == 1){
					has_cards[3][0] = 1;
				}else if(num == 2){
					has_cards[3][1] = 2;
				}else if(num == 3){
					has_cards[3][2] = 3;
				}else if(num == 4){
					has_cards[3][3] = 4;
				}else if(num == 5){
					has_cards[3][4] = 5;
				}else if(num == 6){
					has_cards[3][5] = 6;
				}else if(num == 7){
					has_cards[3][6] = 7;
				}else if(num == 8){
					has_cards[3][7] = 8;
				}else if(num == 9){
					has_cards[3][8] = 9;
				}else if(num == 10){
					has_cards[3][9] = 10;
				}else if(num == 11){
					has_cards[3][10] = 11;
				}else if(num == 12){
					has_cards[3][11] = 12;
				}else if(num == 13){
					has_cards[3][12] = 13;
				}
			}
		}

		// ???????????????????????§?¶????????????????????????????
		for(int m = 0; m < 4; m++) {

			for(int n = 0; n < 13; n++) {

				if(cards[m][n] !=  has_cards[m][n]){

					if(m == 0) {
						System.out.println("S" + " " + cards[m][n]);
					}else if(m == 1) {
						System.out.println("H" + " " + cards[m][n]);
					}else if(m == 2) {
						System.out.println("C" + " " + cards[m][n]);
					}else if(m == 3) {
						System.out.println("D" + " " + cards[m][n]);
					}
				}
			}
		}

	}
}*/