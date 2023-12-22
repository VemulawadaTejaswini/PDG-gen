import java.util.Arrays;
import java.util.Scanner;

// https://atcoder.jp/contests/abc137/tasks/abc137_a
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();


		int[] max = new int[3];
		//Integer[] max = new Integer[3];
		max[0] = A * B;
		max[1] = A - B;
		max[2] = A + B;

		Arrays.sort(max);
		System.out.println(max[2]);
	}

}
