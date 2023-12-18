import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(), N = sc.nextInt(), minDiff = X, pNot[] = new int[101], ans = 0;
		for (int i = 0; i <= 100; i++)
			pNot[i] = 1;
		for (int i = 0; i < N; i++)
			pNot[sc.nextInt()] = 0;
		for (int i = 0; i <= 100; i++)
			if (pNot[i] == 1)
				if (minDiff > Math.abs(X - i)) {
					minDiff = Math.abs(X - i);
					ans = i;
				}
		System.out.println(ans);
	}

}
