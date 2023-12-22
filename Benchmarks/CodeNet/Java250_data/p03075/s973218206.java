import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int[] test = new int[5];
		test[0] = sc1.nextInt();
		test[1] = sc1.nextInt();
		test[2] = sc1.nextInt();
		test[3] = sc1.nextInt();
		test[4] = sc1.nextInt();
		int k = sc1.nextInt();

		Arrays.sort(test);
		//System.out.println(test[4]);
		//System.out.println(test[0]);

		if (test[4]-test[0] <= k) {
			System.out.println("Yay!");
		}
		else {
			System.out.println(":(");
		}

		sc1.close();

	}

}