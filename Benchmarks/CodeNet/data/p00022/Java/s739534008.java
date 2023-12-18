import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;

	private void mainrun() {
		scan = new Scanner(System.in);

		for(int N = scan.nextInt();N != 0;N = scan.nextInt()) {
			looprun(N);
		}

	}

	private void looprun(int N) {
		int Ans = Integer.MIN_VALUE;
		int max = 0;

		for(int i = 0;i < N ;i++) {
			int a = scan.nextInt();

			max = Math.max(max + a,a);
			Ans = Math.max(max, Ans);
		}

		System.out.println(Ans);
	}
}
