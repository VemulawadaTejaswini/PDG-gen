import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// AtCoder_B
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		int X = sc.nextInt();

		for(int i=-100; i<=200; i++) {
			if(X-K < i && i < X+K) {
				if(X-K+1 == i) {
					System.out.print(i);
				}else {
					System.out.print(" "+i);
				}
			}
		}

	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
