import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 地点数の入力
		int n = sc.nextInt();

		int result = 0;

		for (int i = 1; i <= n; i++) {
			String[] iStr = String.valueOf(i).split("");

			if (iStr.length%2==1) result++;
		}

		System.out.println(result);

	}}