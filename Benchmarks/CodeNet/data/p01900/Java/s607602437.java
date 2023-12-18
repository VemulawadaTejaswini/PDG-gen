import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[3];
		for(int i=0;i<n;i++) {
			a[sc.nextInt() % 3]++;
		}
		int max = 1;
		if (a[1] > 0) {
			int score = 0;
			int[] b = Arrays.copyOf(a, 3);
			b[1]--; score++;
			while(true) {
				if (b[1] <= 0) break;
				b[1]--; score++;
				if (b[2] <= 0) break;
				b[2]--; score++;
			}
			score += b[0];
			if (b[1] > 0 || b[2] > 0) score++;
			max = Math.max(max, score);
		}
		if (a[2] > 0) {
			int score = 0;
			int[] b = Arrays.copyOf(a, 3);
			b[2]--; score++;
			while(true) {
				if (b[2] <= 0) break;
				b[2]--; score++;
				if (b[1] <= 0) break;
				b[1]--; score++;
			}
			score += b[0];
			if (b[1] > 0 || b[2] > 0) score++;
			max = Math.max(max, score);
		}
		System.out.println(max);
	}

}