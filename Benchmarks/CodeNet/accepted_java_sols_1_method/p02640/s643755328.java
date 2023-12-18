import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();

		String answer = "No";

		if(Y%2==0) {
			//そもそもの前提としてYは偶数
			for(int i = 0; i <= X; i++) {
				int leg = (2 * i) + (4 * (X - i));
				if(leg == Y) {
					answer = "Yes";
					break;
				}
			}
		}

		System.out.println(answer);
	}

}
