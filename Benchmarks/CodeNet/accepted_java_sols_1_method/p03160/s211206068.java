import java.util.*;

public class Main {

	public static void main(String[] args) {
		//入力受付
		Scanner scanner = new Scanner(System.in);
		int kari = Integer.parseInt(scanner.nextLine());
		String text = scanner.nextLine();

		//リスト作成
		String tempList[] = text.split(" ");
		int intList[] = new int[tempList.length];

		for(int i = 0; i < tempList.length; i++ ) {
			intList[i] = Integer.parseInt(tempList[i]);
		}

		//dpの初期化
		int dp[] = new int[intList.length];
		for(int i = 0; i < dp.length; i++) {
			dp[i] = 0;
		}
		//動的計画法の実施
		dp[1] = Math.abs(intList[1] - intList[0]);
		for(int i = 2; i < intList.length; i++) {
			int f1 = dp[i-1] + Math.abs(intList[i-1] - intList[i]);
			int f2 = dp[i-2] + Math.abs(intList[i-2] - intList[i]);
			if(f1 >= f2) {
				dp[i] = f2;
			}else {
				dp[i] = f1;
			}
		}

		System.out.println(dp[intList.length-1]);
	}
}
