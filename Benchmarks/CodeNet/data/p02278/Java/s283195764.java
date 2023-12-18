import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] w = new int[n];
		boolean[] judge = new boolean[n];

		int AllMin = 10000;

		for (int i = 0; i < n; i++) {
			w[i] = sc.nextInt();
			AllMin = Math.min(AllMin, w[i]);
			judge[i] = false;
		}

		int answer = 0;

		int[] copy = w.clone();
		Arrays.sort(copy);

		for (int i = 0; i < n; i++) {
			if (judge[i] == true || w[i] == copy[i]) {
				judge[i] = true;
				continue;
			}

			int min = w[i];
			int roop = 0;
			int cost = 0;

			while (true) {
				if (judge[i] == true) {
					break;
				}
				roop++;
				judge[i] = true;

				min = Math.min(min, w[Index(copy, w[i])]);

				cost += w[Index(copy, w[i])];
				i = Index(copy, w[i]);
			}

			answer += Math.min(cost + (roop - 2) * min, cost + min + AllMin
					* (roop + 1));

		}
		
		System.out.println(answer);

	}

	public static int Index(int[] w, int X) {
		int index = 0;
		for (int i = 0; i < w.length; i++) {
			if (w[i] == X) {
				index = i;
				break;
			}
		}
		return index;
	}

}