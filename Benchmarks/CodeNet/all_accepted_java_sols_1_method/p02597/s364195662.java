import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// AtCoder_D
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int ans = 0;

		sc.nextLine();
		String C = sc.nextLine();

		int cntR = 0;
		int cntW = 0;

		//RR|WWにする

		for(int i=0; i<N; i++) {
			if(C.charAt(i) == 'R') {
				cntR++;
			}
		}
		ans = Math.max(cntR, cntW);

		for(int i=0; i<N; i++) {
			if(C.charAt(i) == 'R') {
				cntR--;
			} else {
				cntW++;
			}
			if(Math.max(cntR, cntW) < ans) {
				ans = Math.max(cntR, cntW);
			}
		}

		// 出力
		System.out.println(ans);
	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
