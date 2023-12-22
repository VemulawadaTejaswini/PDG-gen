import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();

		int W = sc.nextInt();

		char[][] sky = new char[H][W];

		int[][] ans = new int[H][W];

		String str;

		for(int i=0;i<H;i++) {

			str = sc.next();

			for(int j=0;j<W;j++) {

				sky[i][j] = str.charAt(j);
			}
		}

		boolean flag;

		int r = 0;

		for(int i=0;i<H;i++) {

			flag = false;

			for(int j=0;j<W;j++) {

				if(sky[i][j]=='c') {

					ans[i][j] = 0;

					flag = true;

					r = j;

				}else if(flag == false){

					ans[i][j] = -1;

				}else if(flag == true){

					ans[i][j] = j-r;
				}
			}
		}

		for(int i=0;i<H;i++) {

			for(int j=0;j<W;j++) {

				System.out.print(ans[i][j]);

				if(j!=W-1) System.out.print(" ");
			}

			System.out.println();
		}
	}

}

