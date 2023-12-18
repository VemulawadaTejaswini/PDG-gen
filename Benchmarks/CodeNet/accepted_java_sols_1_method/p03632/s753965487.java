import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//入力 A: Alice、B:Bob
		int A_min = sc.nextInt();
		int A_max = sc.nextInt();
		int B_min = sc.nextInt();
		int B_max = sc.nextInt();
		int answer = 0;

		//Aの最小値よりBの最大値が小さい、もしくは、Aの最大値よりBの最小値が大きい場合：区間の重複はないため答えは0
		if (A_min > B_max || A_max < B_min) {
			answer = 0;
		}

		//Aの最小値よりBの最小値が小さく、Aの最大値よりBの最大値が小さい場合：Aの最小値～Bの最大値まで重複
		else if (A_min >= B_min && A_max >= B_max) {
			answer = B_max - A_min;
		}

		//Aの最小値よりBの最小値が小さく、Aの最大値よりBの最大値が大きい場合：Aの最小値～Aの最大値まで重複
		else if (A_min >= B_min && A_max <= B_max) {
			answer = A_max - A_min;
		}

		//Aの最小値よりBの最小値が大きく、Aの最大値よりBの最大値が小さい場合：Bの最小値～Bの最大値まで重複
		else if (A_min <= B_min && A_max >= B_max) {
			answer = B_max - B_min;
		}

		//Aの最小値よりBの最小値が大きく、Aの最大値よりBの最大値が大きい場合：Bの最小値～Aの最大値まで重複
		else {
			answer = A_max - B_min;
		}
//		else if (A_min <= B_min && A_max >= B_max) {
//			answer = A_max - B_min;
//		}

		System.out.println(answer);
	}
}
