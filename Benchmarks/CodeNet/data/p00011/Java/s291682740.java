import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int w = sc.nextInt();
		int[] sticks = new int[w + 1];
		int n = sc.nextInt();

		for (int i = 1; i < sticks.length; i++)
			sticks[i] = i;
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			String[] swaps = str.split(",");
			int a = Integer.parseInt(swaps[0]);
			int b = Integer.parseInt(swaps[1]);
			int temp = sticks[b];
			sticks[b] = sticks[a];
			sticks[a] = temp;
		}
		for (int i = 1; i < sticks.length; i++)
			System.out.println(sticks[i]);

	}

}