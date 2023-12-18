import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().mainrun();
	}

	Scanner scan;
	int A,B;

	private void mainrun() {
		scan = new Scanner(System.in);

		while(scan.hasNext()) {
			A = scan.nextInt();
			B = scan.nextInt();

			System.out.println(A + B);
		}

		scan.close();
	}

}
