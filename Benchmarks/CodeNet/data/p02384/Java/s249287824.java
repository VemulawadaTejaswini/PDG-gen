package aoj_kuroki;

import java.util.Scanner;

public class Main {

	public class Dice {

		int[] diceInit = new int[6];
		int[] dice = new int[6];

		/**
		 * サイコロを用意する
		 * @param nums
		 */
		public Dice(int[] nums) {
			dice = nums;
			diceInit = nums;
		}

		/**
		 * サイコロの状態を確認
		 */
		public int[] checkSurface() {
			return dice;
		}


		/**
		 * 入力された方向に移動
		 * @param order
		 */
		public void move(String order) {

			for(Character s : order.toCharArray()) {
				int buf;
		        switch(s){
		            case 'N':{
		                buf = dice[0];
		                dice[0] = dice[1];
		                dice[1] = dice[5];
		                dice[5] = dice[4];
		                dice[4] = buf;
		                break;
		            }
		            case 'E':{
		                buf = dice[0];
		                dice[0] = dice[3];
		                dice[3] = dice[5];
		                dice[5] = dice[2];
		                dice[2] = buf;
		                break;
		            }
		            case 'W':{
		                buf = dice[0];
		                dice[0] = dice[2];
		                dice[2] = dice[5];
		                dice[5] = dice[3];
		                dice[3] = buf;
		                break;
		            }
		            case 'S':{
		                buf = dice[0];
		                dice[0] = dice[4];
		                dice[4] = dice[5];
		                dice[5] = dice[1];
		                dice[1] = buf;
		                break;
		            }
		            case 'R': {
		            	buf = dice[1];
		            	dice[1] = dice[2];
		            	dice[2] = dice[4];
		            	dice[4] = dice[3];
		            	dice[3] = buf;
		            }
		        }
			}
		}

		/**
		 * 指定された状態になるまで回転を行う
		 * @param upper
		 * @param flont
		 * @return dice サイコロの状態
		 */
		public int[] checkRight(int upper, int front) {

			// サイコロを初期状態にリセット
			dice = diceInit;


			// 上面が指定の面になるまで回転
			for(int i=0; i<4; i++) {
				if(dice[0] == upper) break;
				move("W");
			}
			if(dice[0] != upper) {
				for(int i=0; i<4; i++) {
					if(dice[0] == upper) break;
					move("E");
				}
			}

			// 正面が指定の面になるまで回転
			for(int i=0; i<4; i++) {
				if(dice[1] == front) break;
				move("R");
			}

			return dice;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] nums = new int[6];
		for(int i=0; i<6; i++) {
			nums[i] = sc.nextInt();
		}

		Dice dice = new Main().new Dice(nums);

		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int upper = sc.nextInt();
			int front = sc.nextInt();
			int[] surface = dice.checkRight(upper, front);
			System.out.println(surface[2]);
		}
		sc.close();

	}

}
