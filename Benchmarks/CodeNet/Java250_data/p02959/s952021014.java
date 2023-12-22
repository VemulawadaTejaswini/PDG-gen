import java.util.Scanner;

public class Main {
	static long count;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] monster = new long[n+1];
		long[] saver = new long[n];

		for (int i = 0; i < n+1; i++) {
			monster[i] = sc.nextLong();
		}

		for (int i = 0; i < n; i++) {
			saver[i] = sc.nextLong();
		}

		long leftOver = monster[0];
		for (int i = 0; i < n; i++) {
			leftOver = attack(leftOver, i, saver, monster);
		}

		System.out.println(count);

	}

	private static long attack(long leftOver, int town, long[] saver, long[] monster) {
		long killFirst = Math.min(leftOver, saver[town]);
		long killSecondPoten = saver[town] - killFirst > 0 ? saver[town] - killFirst : 0;
		long killSecond = Math.min(killSecondPoten, monster[town+1]);
		long secondLeft = monster[town+1] - killSecondPoten > 0 ? monster[town+1] - killSecondPoten : 0;
		count += (killFirst + killSecond);
		return secondLeft;
	}

}