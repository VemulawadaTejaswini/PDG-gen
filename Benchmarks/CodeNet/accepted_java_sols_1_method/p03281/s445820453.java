import java.util.*;

// ARC 98-D
// https://beta.atcoder.jp/contests/arc098/tasks/arc098_b

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int answer = 0;
		int N = in.nextInt();
		
		for (int i = 1; i <= N; i += 2) {
			int nums = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					nums++;
				}
			}
			
			if (nums == 8) {
				answer++;
			}
		}
		
		System.out.println(answer);
    }
}
