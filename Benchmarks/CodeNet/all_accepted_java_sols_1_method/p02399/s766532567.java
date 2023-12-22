import java.util.Scanner;	//Scannerクラス：Java標準入力を取得する

class Main{		//クラス宣言
	public static void main(String[] args){		//メソッド宣言
		int a;				//
		int b;
		int d;
		int r;
		double f;


		try(Scanner sc = new Scanner(System.in)){
			a = sc.nextInt();
			b = sc.nextInt();

			d = a / b;
			r = a % b;
			f = (double)a / b;

			System.out.println(String.format("%d %d %.8f",d,r,f));
		}
	}
}





