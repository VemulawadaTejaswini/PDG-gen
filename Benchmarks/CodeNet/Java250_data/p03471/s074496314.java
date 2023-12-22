import java.util.Scanner;

public class Main {

	//計算に使う定数
	private static final int BILL10k = 10000;
	private static final int BILL5k  = 5000;
	private static final int BILL1k  = 1000;

	public static void main(String[] args) {

		// 処理対象個数の入力
		Scanner sc = new Scanner(System.in);
		int inputBillNum = sc.nextInt();
		int inputPay = sc.nextInt();

		// 札の枚数の組の初期値を代入
		int num10k = -1;
		int num5k = -1;
		int num1k = -1;

		for(int i = 0;i <= inputBillNum;i++) {
			for(int j = 0;i + j <= inputBillNum;j++) {
				if(i * BILL10k + j * BILL5k + (inputBillNum-(i+j)) * BILL1k == inputPay) {
					num10k = i;
					num5k = j;
					num1k = inputBillNum-(i+j);
					break;
				}else if(num10k * BILL10k + num5k * BILL5k + inputBillNum-(num10k+num5k) * BILL1k > inputPay){
					continue;
				}
			}
		}

		sc.close();

		// 出力
		System.out.println(num10k+" "+num5k+" "+num1k);

	}

}