import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 173_C
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();

		int ans = 0;

		sc.nextLine();

		char C[][] = new char[6][6];
		char CWk[][] = new char[6][6];
		char CWk2[][] = new char[6][6];

		// 取り込み
		for (int i=0; i<H; i++) {
			C[i] = sc.nextLine().toCharArray();
		}
	    // Scannerクラスのインスタンスをクローズ
		sc.close();

//		System.out.println("base");
//		for (int i=0; i<6; i++) {
//			System.out.println(new String(C[i]));
//		}
//		System.out.println(" ");

		int  HCase = (int) Math.pow(2, H);
		int  WCase = (int) Math.pow(2, W);
		String HFormat = "%" + H + "s";
		String WFormat = "%" + W + "s";

		for (int HNow=0; HNow<HCase; HNow++) {

			for (int i=0; i<H; i++) {
				for (int j=0; j<W; j++) {
					CWk[i][j] = C[i][j];
				}
			}
//			System.out.println(new String("print CWk"));
//			for (int i=0; i<H; i++) {
//				System.out.println(new String(CWk[i]));
//			}

//			System.out.println("H:" + H + ", 2^H:" + HCase);
//			System.out.println("W:" + W + ", 2^W:" + WCase);

			String HBinStr = String.format(HFormat, Integer.toBinaryString(HNow)).replace(' ', '0');

			for(int i = 0; i<HBinStr.length(); i++) {
				if(HBinStr.charAt(i) == '1') {
					for (int j=0; j<W; j++) {
						CWk[i][j] = 'R';
					}
				}
			}

//			System.out.println("Do H");
//			for (int i=0; i<H; i++) {
//				System.out.println(new String(CWk[i]));
//			}

			for (int WNow=0; WNow<WCase; WNow++) {

				for (int i=0; i<H; i++) {
					for (int j=0; j<W; j++) {
						CWk2[i][j] = CWk[i][j];
					}
				}

//				System.out.println(new String("print CWk2"));
//				for (int i=0; i<H; i++) {
//					System.out.println(new String(CWk2[i]));
//				}

				String WBinStr = String.format(WFormat, Integer.toBinaryString(WNow)).replace(' ', '0');

				for(int j = 0; j<WBinStr.length(); j++) {
					if(WBinStr.charAt(j) == '1') {
						for (int i=0; i<H; i++) {
							CWk2[i][j] = 'R';
						}
					}
				}

//				System.out.println(HNow  +", " + WNow);
//				for (int i=0; i<H; i++) {
//					System.out.println(new String(CWk2[i]));
//				}
//				System.out.println(" ");

				int ast = 0;
				for (int x=0; x<H; x++) {
					for (int y=0; y<W; y++) {
						if(CWk2[x][y] == '#') {
							ast += 1;
						};
					}
				}
				if(K == ast) {
					ans += 1;
				}
			}
		}

		System.out.println(ans);
	}
}
