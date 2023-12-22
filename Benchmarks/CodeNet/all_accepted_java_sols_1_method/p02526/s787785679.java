import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] check = new int[100001];

		int cnt = 0;
		int n = sc.nextInt();
		for (int i = 0; i < n; i++)
			check[i] = sc.nextInt();
		Arrays.sort(check);
		int m = sc.nextInt();
		for (int i = 0; i < m; i++)
			if (Arrays.binarySearch(check, sc.nextInt()) >= 0)
				cnt++;
		System.out.println(cnt);

	}

}