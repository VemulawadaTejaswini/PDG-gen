import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//数取得
		int N = sc.nextInt();
		sc.close();

		for(int i = 1; i <= 10; i++) {
			int answer = 0;

			answer = i*1000 - N;
			if(answer >= 0) {
				System.out.println(answer);
				break;
			}
		}
	}
}
