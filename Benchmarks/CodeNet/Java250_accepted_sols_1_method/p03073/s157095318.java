import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] C = sc.next().toCharArray();
		sc.close();

		// 初めを"0"と仮定して合わない数を探す
		int correct = 0;
		for (int i = 0; i < C.length; i++) {
			char compare = i % 2 == 0 ? '0' : '1';
			if (C[i] == compare) {
				correct++;
			}
		}
		int ans = Math.min(correct, C.length - correct);
		System.out.println(ans);
	}
}
