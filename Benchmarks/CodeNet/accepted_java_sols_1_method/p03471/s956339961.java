import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//input
		// ① N（枚）
		// ② Y（円）
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int Y = scan.nextInt();

		//input check

		if(N<1 || N>2000) {
			System.out.println("N is illegal");
			System.exit(1);
		}

		if(Y<1000 || Y>2*Math.pow(10, 7)) {
			System.out.println("Y is illegal");
			System.exit(1);
		}

		//logic
		//	1.
		int num_10000 = 0;
		int num_5000 = 0;
		int num_1000 = 0;
		boolean is_match = false;


		for(int i = 0; i <= Y/10000;i++) {

			for(int j = 0; j <= Y/5000;j++) {

				int k = N - i - j;//3重loopを2重loopへ
				if(k < 0) continue;

				if((10000*i) + (5000*j) + (1000*k) == Y) {
						num_10000 = i;
						num_5000 = j;
						num_1000 = k;
						is_match = true;
						break;
				}

			}
		}



		//output
		//N枚のお札の合計金額が Y円となることがありえない場合は、-1 -1 -1 と出力
		if(is_match == false) {
			System.out.println("-1 -1 -1");

		}else {
			System.out.print(num_10000);
			System.out.print(" ");
			System.out.print(num_5000);
			System.out.print(" ");
			System.out.print(num_1000);
			System.out.print(" ");
		}

	}



}
