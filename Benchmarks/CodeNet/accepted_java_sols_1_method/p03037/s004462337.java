import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] table = new int[100100];
		Arrays.fill(table, 0);
		for (int i = 0; i < M; i++) {
			table[sc.nextInt()]++;
			table[sc.nextInt() + 1]--;
		}


		for (int i = 1; i < table.length; i++) {
			table[i] += table[i - 1];
		}

		/*
		for (int i = 0; i < 10; i++) {
			System.out.println(table[i]);
		}
		*/

		int cnt = 0;
		for (int i = 0; i < table.length; i++) {
			if (table[i] == M) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}
