import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// M-SOL_2020_B
		Scanner sc = new Scanner(System.in);
		String Ans = "Yes";

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();

		while(B <= A) {
			B *= 2;
			K--;
		}
		while(C <= B) {
			C *= 2;
			K--;
		}

		if(K < 0) {
			Ans = "No";
		}
		System.out.println(Ans);

	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
