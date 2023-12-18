import java.util.Scanner;	//Scannerクラス：Java標準入力を取得する

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
		int n = sc.nextInt();
		int v = 0;
		int[][][] member = new int[4][3][10];
		int r = 0;
		int f = 0;
		int b = 0;

		for(int i = 0;i < n;i++) {
		r = sc.nextInt();
		f = sc.nextInt();
		b = sc.nextInt();
		v = sc.nextInt();
		member[r-1][f-1][b-1] += v;
		}

		for(int j = 0;j < 4;j++) {
			for(int k = 0;k < 3;k++) {
				for(int l = 0;l < 10;l++) {

					if(member[j][k][l] == 0) {
						System.out.print(" ");
						System.out.print(0);
					}else {
						System.out.print(" ");
						System.out.print(member[j][k][l]);
							}
						}
				System.out.println();
				if(k == 2 && j < 3)
					System.out.println("####################");
					}
				}
			}
		}
	}

