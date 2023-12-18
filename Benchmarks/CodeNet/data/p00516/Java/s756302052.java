import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int n = sc.nextInt();
	static int m = sc.nextInt();
	static int[] cost = new int[n];
	static int[] standard = new int[m];
	static ArrayList<Integer> vote = new ArrayList<Integer>();

	public static void main(String[] args) {
		inputData();
		voting();
	}

	private static void inputData() {
		for (int i = 0; i < n; i++) {
			cost[i] = sc.nextInt();
		}

		for (int i = 0; i < m; i++) {
			standard[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			vote.add(i, 0);
		}
	}

	private static void voting() {
		int max = -1;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {

				if (standard[i] >= cost[j]) {
					vote.set(j, vote.get(j) + 1);
					break;
				}

			}
		}

		for (int i = 0; i < n; i++) {
			max = Math.max(max, vote.get(i));
		}
/*
		for (int i = 0; i < n; i++) {
			System.out.print(vote.get(i) + " ");
		}System.out.println();


		System.out.printf("max = %d\n",max);
*/

		System.out.println(vote.indexOf(max) + 1);
	}

}

