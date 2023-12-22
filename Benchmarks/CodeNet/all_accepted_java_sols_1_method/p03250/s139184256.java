import java.util.Arrays;
import java.util.Scanner;

class Main{

	static char[][] map;
	static int H;
	static int W;
	static	int D ;
	static	int G ;
	static	int[] p;
	static	int[] c;
	static int ans = 100000000;

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int[] data = {A,B,C};
		Arrays.sort(data);
		int ans = 10*data[2]+data[1]+data[0];
		System.out.println(ans);


		

	}



}



