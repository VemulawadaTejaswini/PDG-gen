import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		//数取得
		String a = sc.next();
		String b = sc.next();

		String gudem = a+b;
		int num = Integer.parseInt(gudem);

		String answer = "No";

		for(int i = 0; i * i < 100000; i++) {
			if(num == i * i) {
				answer = "Yes";
				break;
			}
		}

		System.out.println(answer);
	}

}
