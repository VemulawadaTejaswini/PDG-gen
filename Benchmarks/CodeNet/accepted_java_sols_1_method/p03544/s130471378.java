import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long L0 = 2L;
		long L1 = 1L;
		int N = sc.nextInt();
		long Li1 = L0;
		long Li2 = L1;
		long ryuka = 0;
		if(N == 0) {
			System.out.println(L0);
			System.exit(0);
		}
		if(N == 1) {
			System.out.println(L1);
			System.exit(0);
		}

		for(int i = 1;i < N;i++) {
			ryuka = Li1 + Li2;
			Li1 = Li2;
			Li2 = ryuka;
		}
		System.out.println(ryuka);
	}

}