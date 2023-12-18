import java.util.Scanner;

public class Search1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] check = new int[2][501];

		int cnt = 0;
		int n = sc.nextInt();
		for (int i = 0; i < n; i++)
			check[0][sc.nextInt()]++;
		int m = sc.nextInt();
		for (int i = 0; i < m; i++)
			check[1][sc.nextInt()]++;
		for (int i = 0; i < check[0].length; i++)
			if (check[0][i] > 0 && check[1][i] > 0) cnt++;

		System.out.println(cnt);

	}

}