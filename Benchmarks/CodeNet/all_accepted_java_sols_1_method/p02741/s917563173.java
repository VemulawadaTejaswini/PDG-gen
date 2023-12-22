import java.util.Scanner;

// https://atcoder.jp/contests/panasonic2020/tasks/panasonic2020_a
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		sc.close();

		int[] array = {1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51};

		System.out.println(array[K-1]);
	}
}
