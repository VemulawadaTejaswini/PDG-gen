import java.util.Scanner;

public class Main{

	static int[][][] arrayFloor = new int[4][3][10];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();

		//??????????????????
		for(int k = 0; k < 4; k++) {
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 10; j++) {
					arrayFloor[k][i][j] = 0;
				}
			}
		}

		for(int i = 0; i < A; i++) {

			int b = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			int v = sc.nextInt();

			switch(b) {
			case 1:
				calculate(b, f, r, v);
				break;

			case 2:
				calculate(b, f, r, v);
				break;

			case 3:
				calculate(b, f, r, v);
				break;

			case 4:
				calculate(b, f, r, v);
				break;
			}

		}

		for(int k = 0; k < 4; k++) {
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 10; j++) {
					System.out.print(" "+arrayFloor[k][i][j]);
				}
				System.out.println("");
			}
			if(!(k == 3)) {
				System.out.println("####################");
			}
		}


	}
	public static void calculate(int b, int f, int r, int v) {

		if(arrayFloor[b-1][f-1][r-1] != 0) {
			arrayFloor[b-1][f-1][r-1] = arrayFloor[b-1][f-1][r-1] + v;
		}
		else {
			arrayFloor[b-1][f-1][r-1] = v;
		}
	}
}