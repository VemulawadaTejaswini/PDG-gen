import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> answer = new ArrayList<Integer>();
		boolean canFlg = false;

		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= 9; b++) {
				answer.add(a * b);
			}
		}

		for (int c : answer) {
			if (c == N) {
				System.out.println("Yes");
				canFlg = true;
				break;
			}
		}
		if (!canFlg) {
			System.out.println("No");
		}
	}
}
