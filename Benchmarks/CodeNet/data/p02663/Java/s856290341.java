import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int H1 = scan.nextInt();
		int M1 = scan.nextInt();
		int H2 = scan.nextInt();
		int M2 = scan.nextInt();

		int HA = H2-H1;
		int MA = M2-M1;

		HA = HA*60;
		int t = HA+MA;

		int K = scan.nextInt();

		t = t-K;

		System.out.println(t);

	}

}
