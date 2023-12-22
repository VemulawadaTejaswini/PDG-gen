import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//input
		//爆弾ありのH x Wのマス情報



		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int W = scan.nextInt();

		if(H<0 || H>50) {
			System.out.println("illegal");
			System.exit(1);
		}

		if(W<0 || W>50) {
			System.out.println("illegal");
			System.exit(1);
		}

		//System.out.println(H);
		//3System.out.println(W);

		char masu[][];
		masu = new char[H][W];

		for(int row = 0;row<H;row++) {
			String one_line_str = scan.next();					//nextとnextlineの違い

			if(one_line_str.length() != W) {
				System.out.println("str.length illegal");
				System.exit(1);
			}

			char words[] = one_line_str.toCharArray();

			masu[row] = words;

			//System.out.println("input str:" + one_line_str);

		}

		/*
		for(int row = 0; row<H;row++) {

			for(int cloumn = 0; cloumn < W;cloumn++) {
				System.out.print(masu[row][cloumn]);
			}
			System.out.println("");

		}
		*/

		//logic
		//	1.(0,0)マスから(H,W)まで、順番にマスを探索していき、四方八方のマス情報内から"#"の数をカウントして表示

		//	2.(全マス探索以外)マスごとに、四方八方情報を格納してやる。これにより、複数回自分の周り8マス全部を調べる必要がなくなる

		//	3.

		int my_position_x = 0;
		int my_position_y = 0;
		char bom='#';

		for(int row = 0; row<H;row++) {//イルカの移動

			for(int cloumn = 0; cloumn < W;cloumn++) {
				//System.out.print(masu[row][cloumn]);

				//bomマスならサーチしないので、次のマスへ
				if(masu[row][cloumn] == bom) {
					continue;
				}

				//サーチ
				int bom_num = 0;
				int search_position_x;
				int search_position_y;
				//左斜め上
				search_position_x = row -1;
				search_position_y = cloumn -1;

				if(search_position_x  >= 0 && search_position_x < H && search_position_y >= 0 && search_position_y < W) {
					if(masu[search_position_x][search_position_y] == bom) {
						bom_num++;
					}
				}

				//上
				search_position_x = row -1;
				search_position_y = cloumn;

				if(search_position_x  >= 0 && search_position_x < H && search_position_y >= 0 && search_position_y < W) {
					if(masu[search_position_x][search_position_y] == bom) {
						bom_num++;
					}
				}

				//斜め右上
				search_position_x = row -1;
				search_position_y = cloumn +1;

				if(search_position_x  >= 0 && search_position_x < H && search_position_y >= 0 && search_position_y < W) {
					if(masu[search_position_x][search_position_y] == bom) {
						bom_num++;
					}
				}

				//右
				search_position_x = row;
				search_position_y = cloumn +1;

				if(search_position_x  >= 0 && search_position_x < H && search_position_y >= 0 && search_position_y < W) {
					if(masu[search_position_x][search_position_y] == bom) {
						bom_num++;
					}
				}

				//右斜め下
				search_position_x = row+1;
				search_position_y = cloumn +1;

				if(search_position_x  >= 0 && search_position_x < H && search_position_y >= 0 && search_position_y < W) {
					if(masu[search_position_x][search_position_y] == bom) {
						bom_num++;
					}
				}


				//下
				search_position_x = row+1;
				search_position_y = cloumn;

				if(search_position_x  >= 0 && search_position_x < H && search_position_y >= 0 && search_position_y < W) {
					if(masu[search_position_x][search_position_y] == bom) {
						bom_num++;
					}
				}

				//左斜め下
				search_position_x = row+1;
				search_position_y = cloumn -1;

				if(search_position_x  >= 0 && search_position_x < H && search_position_y >= 0 && search_position_y < W) {
					if(masu[search_position_x][search_position_y] == bom) {
						bom_num++;
					}
				}

				//左
				search_position_x = row;
				search_position_y = cloumn -1;

				if(search_position_x  >= 0 && search_position_x < H && search_position_y >= 0 && search_position_y < W) {
					if(masu[search_position_x][search_position_y] == bom) {
						bom_num++;
					}
				}

				//System.out.println(bom_num);
				masu[row][cloumn] = Integer.toString(bom_num).charAt(0);
			}

		}

		//output
		//各マス目(但し、爆弾がないマスに限る)に対して、四方八方の爆弾の数字が書かれたマス情報を出力
		for(int row = 0; row<H;row++) {

			for(int cloumn = 0; cloumn < W;cloumn++) {
				System.out.print(masu[row][cloumn]);
			}
			System.out.println("");

		}


	}

}
