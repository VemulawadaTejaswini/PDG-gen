import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		double maxSum = 0;
		double tmpSum = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			list.add(num);
			tmpSum += num;
			if (list.size() >= k) {
				if (tmpSum > maxSum) {
					maxSum = tmpSum;
				}
				tmpSum -= list.get(i - (k - 1));
			}
		}

		double re = (maxSum + k) / 2;
		System.out.println(re);
	}

}