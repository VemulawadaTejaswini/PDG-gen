import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		int currentSum =0;

		for (int i = 0; i < n; i++) {
			int w = sc.nextInt();
			currentSum += w;
			list.add(currentSum);
		}

		int minimunDiff=10000;
		for (int sum : list) {
			int currentDiff =Math.abs((currentSum-sum)-sum);
			minimunDiff = Math.min(minimunDiff, currentDiff);
		}
		System.out.println(minimunDiff);

	}

}
