import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int count = 0;
		do {
			//ログイン日数
			count++;
			if (count % 7 == 0) {
				C -= B;
			}
			C -= A;

		} while(C > 0);
		System.out.println(count);
	}

}
