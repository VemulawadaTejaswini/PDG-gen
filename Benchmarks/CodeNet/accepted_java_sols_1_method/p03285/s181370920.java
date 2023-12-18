import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		final int CAKE = 4; //ケーキ1個の値段
		final int DONUTS = 7; //ドーナツ1個の値段
		int N; //合計金額
		boolean frag = false;

		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();

		for( int i = 0; i <= N / CAKE; i++ ) {
			if ( ( N - (CAKE * i) ) % DONUTS == 0 ) {
				frag = true;
				break;
			}else {
				frag = false;
			}
		}

		if( frag == true ) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}

		scan.close();

	}
}