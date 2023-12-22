import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[5];
		long total = 0;

		for (int i = 0; i < n; i++) {
			char s = sc.next().charAt(0);
			switch (s) {
				case 'M':
				a[0]++;
				break;
				case 'A':
				a[1]++;
				break;
				case 'R':
				a[2]++;
				break;
				case 'C':
				a[3]++;
				break;
				case 'H':
				a[4]++;
				break;
			}
		}

		long answer = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = i + 1; j < 4; j++) {
				for (int k = j + 1; k < 5; k++) {
					answer += a[i] * a[j] * a[k];
				}
			}
		}

		System.out.println(answer);
	}
}
