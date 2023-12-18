import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] split = s.split(" ");
		int N = Integer.parseInt(split[0]);
		int M = Integer.parseInt(split[1]);
		int C = Integer.parseInt(split[2]);
		s = sc.nextLine();
		split = s.split(" ");
		int[] b = new int[M];
		for (int i = 0; i < M; i++)
			b[i] = Integer.parseInt(split[i]);

		int cnt = 0;
		for (int i = 0; i < N; i++) {
			s = sc.nextLine();
			split = s.split(" ");
			int sum = 0;
			for (int j = 0; j < M; j++) {
				int ai = Integer.parseInt(split[j]);
				sum += ai * b[j];
			}
			sum += C;
			if (sum > 0)
				cnt++;
		}

		System.out.println(cnt);

		sc.close();
	}
}