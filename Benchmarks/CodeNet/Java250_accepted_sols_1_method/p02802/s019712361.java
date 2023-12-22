import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int p[] = new int[M];
		String S[] = new String[M];
		Set correctSet = new HashSet<Integer>();
		Set wrongSet = new HashSet<Integer>();
		Set submitAnswer = new HashSet<Integer>();
		int correct = 0;
		int wrong = 0;

		for (int i = 0; i < M; i++) {
			p[i] = sc.nextInt();
			S[i] = sc.next();
			if ("AC".equals(S[i])) submitAnswer.add(p[i]);
		}

		for (int i = 0; i < M; i++) {
			if (submitAnswer.contains(p[i])) {
				if ("WA".equals(S[i])  && !correctSet.contains(p[i])) {
					wrongSet.add(p[i]);
					wrong++;
				} else if ("AC".equals(S[i]) && !correctSet.contains(p[i])) {
					correctSet.add(p[i]);
					correct++;
				}
			}
		}

		System.out.println(correct + " " + wrong);
	}
}