import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;
	private int N,x,y;
	private char[][] F;

	private void mainrun() {
		scan = new Scanner(System.in);

		N = scan.nextInt();
		F = new char[8][8];

		for(int i = 0;i < N;i++) {
			y = scan.nextInt();
			x = scan.nextInt();
			F[y][x] = 'Q';

			Xpoint(y,x);
		}

		loop(0);
		//System.out.print(check());
		scan.close();
	}

	private int[][] vector = {{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1}};

	private void loop(int n) {
		for(int i = 0;i < 8;i++) {
			if(F[n][i] == 'X') {
				continue;
			}else {
				if(F[n][i] != 'Q' ) {
					F[n][i] = 'Q';
				}

				if(n == 7) {
					if(check()) {
						print();
						break;
					}
				}else {
					loop(n+1);
				}
				F[n][i] = '\0';
			}
		}
	}

	private boolean check() {
		for(int i = 0;i < 8;i++) {
			for(int j = 0;j < 8;j++) {
				if(F[i][j] == 'Q') {

					for(int k = 0;k < 8;k++) {
						x = j;
						y = i;

						while(	0 <= y + vector[k][0] && y + vector[k][0] < 8 &&
								0 <= x + vector[k][1] && x + vector[k][1] < 8 ){

							y += vector[k][0];
							x += vector[k][1];

							if(F[y][x] == 'Q') {
								return false;
							}
						}
					}
					break;
				}
			}
		}

		return true;
	}


	private void Xpoint(int yy,int xx) {
		for(int i = 0;i < 8;i++) {
			x = xx;
			y = yy;

			while(	0 <= y + vector[i][0] && y + vector[i][0] < 8 &&
					0 <= x + vector[i][1] && x + vector[i][1] < 8 ){

				y += vector[i][0];
				x += vector[i][1];

				F[y][x] = 'X';
			}
		}
	}

	private void print() {
		for(int i = 0;i < 8;i++) {
			for(int j = 0;j < 8;j++) {
				if(F[i][j] == 'Q') {
					System.out.print('Q');
				}else {
					System.out.print('.');
				}
			}

			System.out.println();
		}
	}

}

