import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		int sum = 0;
		for(int i = 0; i < 2; i++) {
			sum += Math.max(A, B);
			if (Math.max(A, B) == A) {
				A--;
			} else {
				B--;
			}
		}

		System.out.println(sum);
	}

}