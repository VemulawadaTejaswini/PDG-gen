import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if(a >= b) {

			String answer = String.valueOf(b);

			for(int i = 1;i < a;i++) {

				answer = answer + String.valueOf(b);

			}
			System.out.println(answer);
		}else {

			String answer = String.valueOf(a);

			for(int i = 1;i < b;i++) {

				answer = answer + String.valueOf(a);

			}
			System.out.println(answer);
		}

	}

}
