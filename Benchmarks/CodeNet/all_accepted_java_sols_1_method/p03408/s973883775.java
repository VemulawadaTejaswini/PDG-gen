import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] blues = new String[n];
		for (int i = 0; i < n; i++) {
			blues[i] = sc.next();
		}
		int m = sc.nextInt();
		String[] reds = new String[m];
		for (int i = 0; i < m; i++) {
			reds[i] = sc.next();
		}
		int max = 0;
		for (int i = 0; i < n; i++) {
			int score = 0;
			for (int j = 0; j < n; j++) {
				if (blues[i].equals(blues[j])) {
					score++;
				}
			}
			for (int j = 0; j < m; j++) {
				if (blues[i].equals(reds[j])) {
					score--;
				}
			}
			if (score > max) {
				max = score;
			}
		}
		System.out.println(max);
	}
}
