import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int max = 0;
		int min = 0;
		for (int i = 0; i < length; i++) {
			int A = sc.nextInt();
			if (i == 0) {
				max = A;
				min = A;
			}

			if (max < A) {
				max = A;
			}
			if (min > A) {
				min = A;
			}
			
		}
		System.out.println(max-min);
	}

}