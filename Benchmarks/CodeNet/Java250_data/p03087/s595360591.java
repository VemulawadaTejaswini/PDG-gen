import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) throws Exception {
		sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();

		// 先にX文字目にACは何文字あったか、の数列をつくっておく。
		// ていうか問題の入力を始めてから回答を受け取るまでの時間を測ってるんだな。
		// 随時答えるほうがよいんだな。

		int[] t = new int[N];
		t[0] = 0;
		for (int i = 0; i < N - 1; i++) {

			t[i + 1] = t[i] + (S.substring(i, i + 2).equals("AC") ? 1 : 0);
		}

		question[] questions = new question[Q];

		for (int i = 0; i < Q; i++) {
			questions[i] = new question();
			questions[i].i = sc.nextInt();
			questions[i].r = sc.nextInt();
			// System.out.println(questions[i]);
		}

		for (question q : questions) {
			System.out.println(t[q.r - 1] - t[q.i - 1]);
		}

	}
}

class question {
	int i;
	int r;

	public String toString() {
		return "i:" + i + ",r:" + r;
	}
}