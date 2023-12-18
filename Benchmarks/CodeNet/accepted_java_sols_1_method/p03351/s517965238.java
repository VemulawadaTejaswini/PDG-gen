import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//標準入力の読み込み
		Scanner sc = new Scanner(System.in);
		//入力値を格納
		int lcA = sc.nextInt();
		int lcB = sc.nextInt();
		int lcC = sc.nextInt();
		int disD = sc.nextInt();
		
		//2点間の距離判定
		//C地点とA地点で直接会話可能か
		boolean isTalkableBetWeenCAndA = Math.abs(lcA - lcC) <= disD;
		//B地点とA地点で直接会話可能か
		boolean isTalkableBetWeenAAndB = Math.abs(lcB - lcA) <= disD;
		//A地点とB地点で直接会話可能か
		boolean isTalkableBetWeenBAndC = Math.abs(lcB - lcC) <= disD;;
		
		if (isTalkableBetWeenCAndA || (isTalkableBetWeenAAndB && isTalkableBetWeenBAndC) ) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
