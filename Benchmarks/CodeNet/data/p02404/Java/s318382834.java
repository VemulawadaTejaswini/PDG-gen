import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//再利用の時はここからけす
		while(true) {
			int row = sc.nextInt();
			int column = sc.nextInt();

			if(row == 0 && column ==0) break;

			for(int rowDraw = 0; row > rowDraw; rowDraw++) {

					if(rowDraw == 0 || rowDraw == (row - 1)) {
						//すべてがシャープ
						drawSharp(column);
					}else {
						//シャープとドッドの兼用
						drawSharpAndDots(column);
					}
				}
			System.out.println("");
		}
		//End of Main Method
		}

		private static void drawSharp(int column) {
			String drawSharp = "#";
			for(int i = 1; column  > i; i++) {
				drawSharp = drawSharp + "#";
			}
			System.out.println(drawSharp);
		}

		private static void drawSharpAndDots(int column) {
			String drawSharpAndDots = "#";
			for(int j = 1; column > j; j++) {
				if(j == (column - 1)) {
					drawSharpAndDots = drawSharpAndDots + "#";
				}else {
					drawSharpAndDots = drawSharpAndDots + ".";
				}
			}
			System.out.println(drawSharpAndDots);
		}



	//End of this Class
}

