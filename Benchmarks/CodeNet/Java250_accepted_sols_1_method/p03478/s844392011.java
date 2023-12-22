import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		// TODO ABC_083_B
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
	    // Scannerクラスのインスタンスをクローズ
		sc.close();

		int ret = 0;
		int sum = 0;
		int iTmp = 0;

		for(int i=1; i<=N; i++) {
			sum = 0;
			iTmp = i;
			while(iTmp != 0) {
				sum += iTmp%10;
				iTmp = iTmp / 10;
			}
			if(A <= sum && sum <= B) {
				ret += i;
			}
		}

		// 出力
		System.out.println(ret);

	}
}
