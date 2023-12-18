import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int w = scan.nextInt();
		Character[][] masu = new Character[h+2][w+2];
		for(int i=0;i<w+2;i++) {
			masu[0][i]='.';
			masu[h+1][i]='.';
			}
		for(int i=0;i<h+2;i++) {
			masu[i][0]='.';
			masu[i][w+1]='.';
			}





		for (int i = 0; i < h; i++) {
			String s = scan.next();
			for (int l = 0; l < w; l++) {

				masu[i+1][l+1] = s.charAt(l);
			}
		}
		/*
		for (int i = 0; i < h+2; i++) {
			System.out.println();
					for (int l = 0; l < w+2; l++) {
			System.out.print(masu[i][l]);
					}
		}
*/

		for (int i = 1; i < h+1; i++) {
			for (int l = 1; l < w+1; l++) {
				/*
				//四隅だったらチェックが減る
				if ((i == 0 && l == 0) || (i == 0 && l == w - 1) || (i == h - 1 && l == 0)
						|| (i == h - 1 && l == w - 1)) {



					//端っこだったらチェックが減る
				} else if (i == 0 || i == h - 1) {

				} else if (l == 0 || l == w - 1) {

				} else { //それ以外
				*/
					if (masu[i][l] == '.') {
						int count = 0;
						if (masu[i][l - 1] == '#') {
							count++;
						}
						if (masu[i - 1][l - 1] == '#') {
							count++;
						}
						if (masu[i - 1][l] == '#') {
							count++;
						}
						if (masu[i - 1][l + 1] == '#') {
							count++;
						}
						if (masu[i][l + 1] == '#') {
							count++;
						}
						if (masu[i + 1][l + 1] == '#') {
							count++;
						}
						if (masu[i + 1][l] == '#') {
							count++;
						}
						if (masu[i + 1][l - 1] == '#') {
							count++;
						}
						String strC = String.valueOf(count);
						//System.out.println(strC);
						masu[i][l] = strC.charAt(0);
						//System.out.println(masu[i][l]);


					}

				}

			}


	for (int i =1 ; i < h+1; i++) {
System.out.println();
		for (int l = 1; l < w+1; l++) {
System.out.print(masu[i][l]);
		}

	}

	}

}
