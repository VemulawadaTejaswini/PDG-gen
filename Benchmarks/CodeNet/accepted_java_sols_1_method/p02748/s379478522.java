import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int m = sc.nextInt();
		int aArray[] = new int[a]	;
		int bArray[] = new int[b]	;

		int aMin = Integer.MAX_VALUE;
		for (int i = 0; i < a; i++) {
			aArray[i] = sc.nextInt();
			if (aArray[i] < aMin) aMin = aArray[i];
		}

		int bMin = Integer.MAX_VALUE;
		for (int i = 0; i < b; i++) {
			bArray[i] = sc.nextInt();
			if (bArray[i] < bMin) bMin = bArray[i];
		}

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int c = sc.nextInt();
			int sum = aArray[x - 1] + bArray[y - 1] - c;
			if (sum < min) min = sum;
		}

		System.out.println(Math.min(aMin + bMin, min));

		sc.close();
	}

}
