import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		boolean flag = true; //ループの初期値

		for (int i = 0; i < N; i++) {
			int A = scanner.nextInt();

			if (A % 2 == 0 && A % 3 != 0 && A % 5 != 0) {
				
				System.out.println("DENIED");
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println("APPROVED");
		}
	}

}