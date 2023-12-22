import java.util.Scanner;

public class Main{

	/**
	 * 各部屋の入居者数を出力する
	 * @param args	0:何件の情報が入力されるのか
	 * 				1:棟2:階数3:何番目の部屋4:入居者の増減
	 */
	static Scanner scan = new Scanner(System.in);
	public  static void main(String[] args){

		int[][] r =  new int[16][10];	//部屋番号2重リスト

		//二次元配列に入居者数の増減値を与える
		int info_num = scan.nextInt();
		for(int input_n=1;input_n< info_num * 4;input_n = input_n + 4){//

			int building = scan.nextInt() -1;
			int floor = scan.nextInt() -1;
			int room = scan.nextInt() -1;
			int value = scan.nextInt();

			//			
			//			int building = Integer.parseInt(args[input_n]) -1;		//棟数
			//			int floor = Integer.parseInt(args[input_n+1])-1;			//フロア階
			//			int room = Integer.parseInt(args[input_n+2])-1;			//部屋数
			//			int value = Integer.parseInt(args[input_n+3]);			//人数

			r[building*4+(floor)][room] += value;						//その部屋に何人いるか追加
		}

		//書き出し

		for(int tate = 0;tate<4;tate++){
			for(int k= 0;k<3;k++){
				for(int j = 0;j < 10;j++){

					System.out.print(" "+r[tate*4+k][j]);
				}
				System.out.println("");

			}
			if(tate!=3)
				System.out.println("####################");		//20個
		}


	}
}

