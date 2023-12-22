import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 140_D
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.nextLine();
		String S = sc.nextLine();
		// Scannerクラスのインスタンスをクローズ
		sc.close();

		int i=0;

		int happy = 0;

		for(i=0; i<N-1; i++) {
			if(S.substring(i, i+1).equals(S.substring(i+1, i+2))){
				happy++;
			}
		}
		happy += 2*K;
		if(happy>=N) {
			happy = N-1;
		}

		System.out.println(happy);

	}
}
