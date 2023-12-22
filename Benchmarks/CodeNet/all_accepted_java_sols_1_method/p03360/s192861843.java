import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int[] num = new int[3];
		num[0] = sc1.nextInt();
		num[1] = sc1.nextInt();
		num[2] = sc1.nextInt();
		int k = sc1.nextInt();
		Arrays.sort(num);

		for (int i = 0 ; i < k ; i++ ) {
			num[2] *= 2;
		}

		System.out.println(num[0] + num[1] + num[2]);

		sc1.close();

	}

}