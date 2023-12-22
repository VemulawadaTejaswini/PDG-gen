import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int s[] = new int[N];
      int answer=0;
      int d;
      int A;
		for (int i = 0; i < K; i++) {
			d = scan.nextInt();
			for (int y = 0; y < d; y++) {
				A = scan.nextInt();
				s[A - 1]++;
			}
		}
		for (int i = 0; i < N; i++) {
			if (s[i] == 0) {
				answer += 1;
			}
		}
		System.out.println(answer);
	}
}
