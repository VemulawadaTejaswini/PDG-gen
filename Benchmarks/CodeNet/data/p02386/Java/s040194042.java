import java.util.*

public class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		 Dice3 di3 = new Dice3();		//Dice3のインスタンス

		int n = scan.nextInt();		//回数n

		int[] dice1 = new int[6];		//dice1作成
		for(int i=0; i<6; i++) {
			dice1[i] = scan.nextInt();
		}

		int[] answer2 = new int[6]; 	//確認した後の配列
		boolean flag = false;			//最終判定

		int[] dice2 = new int[6];		//dice2作成

		//n-1回サイコロを作成し確認
		for(int i=0; i<n-1; i++) {

			for(int j=0; j<6; j++) {
				dice2[j] = scan.nextInt();
			}


			answer2 = di3.check(dice1, dice2);		//総当たりで確認


			if(Arrays.equals(dice1, answer2)) {
				flag = true;
				break;
			}
		}

		if(flag) {		//既に算出済み
			System.out.println("No");
		}else
			System.out.println("Yes");
	}
}



class Dice3{
	static int top = 0;
	static int side1 = 0;
	
	static int[] answer = new int[6]; //動かすサイコロの形

	//command（特定の文字が入力された際、その方向に転がす）
	int[] command(int[] dice, char com) {
	    	top = dice[0];	//dice[0]を覚えておく
	    	side1 = dice[1];	//dice[1]を覚えておく

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


	//check（全ての面で配列d2を横回転させ配列d１と比較）
	int[] check(int[] d1 ,int[] d2) {

		//N方向回転
		for(int k=0; k<4; k++) {

			if(Arrays.equals(d1, answer)) {		//配列の比較はArraysから
				break;
			}
			answer = command(d2, 'N');

			//横回転
			for(int l=0; l<4; l++) {

				if(Arrays.equals(d1, answer)) {
					break;
				}
				answer = command(d2, 'R');
			}
		}

		//W方向回転
		for(int k=0; k<4; k++) {

			if(Arrays.equals(d1, answer)){
				break;
			}
			answer = command(d2, 'W');

			//横回転
			for(int l=0; l<4; l++) {

				if(Arrays.equals(d1, answer)) {
					break;
				}
				answer = command(d2, 'R');
			}
		}
		return answer;
	}
}
